package com.greatlearning.employeemanagement.EmployeeManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.EmployeeManagement.entities.Users;
import com.greatlearning.employeemanagement.EmployeeManagement.repo.UserRepository;
import com.greatlearning.employeemanagement.EmployeeManagement.security.MyUserDetails;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users user = userRepository.getByUsername(username);
		return new MyUserDetails(user);
	}
	
}
