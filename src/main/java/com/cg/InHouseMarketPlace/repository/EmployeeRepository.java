package com.cg.InHouseMarketPlace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.InHouseMarketPlace.model.Employee;
import com.cg.InHouseMarketPlace.model.Offer;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	Offer getClass(Offer offer);

}