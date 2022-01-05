package com.greatlearning.employeemanagement.EmployeeManagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemanagement.EmployeeManagement.entities.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);
	
//	List<Employee> findByOrderByFirstNameContainsAllIgnoreCaseAsc(String firstName);
}
