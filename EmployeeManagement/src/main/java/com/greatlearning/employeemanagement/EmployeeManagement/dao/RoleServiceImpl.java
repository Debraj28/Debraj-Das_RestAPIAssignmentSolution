package com.greatlearning.employeemanagement.EmployeeManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.EmployeeManagement.entities.Roles;
import com.greatlearning.employeemanagement.EmployeeManagement.repo.RoleRepository;
import com.greatlearning.employeemanagement.EmployeeManagement.services.RoleService;



@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void addRole(Roles roles) {
		roleRepository.saveAndFlush(roles);
	}
}
