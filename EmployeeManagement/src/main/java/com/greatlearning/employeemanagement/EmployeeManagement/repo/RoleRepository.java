package com.greatlearning.employeemanagement.EmployeeManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemanagement.EmployeeManagement.entities.Roles;



public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
