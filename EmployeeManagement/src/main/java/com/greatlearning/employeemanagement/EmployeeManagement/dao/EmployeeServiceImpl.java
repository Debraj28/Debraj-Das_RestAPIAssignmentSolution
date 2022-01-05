package com.greatlearning.employeemanagement.EmployeeManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.EmployeeManagement.entities.Employee;
import com.greatlearning.employeemanagement.EmployeeManagement.repo.EmployeeRepository;
import com.greatlearning.employeemanagement.EmployeeManagement.services.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.saveAndFlush(employee);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.getById(id);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	@Override
	public List<Employee> searchBy(String firstName) {
		// TODO Auto-generated method stub
		return employeeRepository.findByFirstNameContainsAllIgnoreCase(firstName);
	}

	@Override
	public List<Employee> sortBy(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll(Sort.by(Sort.Direction.ASC,"employees"));
	}

}
