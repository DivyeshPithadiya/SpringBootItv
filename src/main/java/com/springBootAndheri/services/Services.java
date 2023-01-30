package com.springBootAndheri.services;

import java.util.List;

import com.springBootAndheri.models.Employee;

public interface Services {

	public List<Employee> getEmployees();
	public List<Employee> saveEmployee(Employee employee);
	public List<Employee> updateEmployee(Employee employee);
	public List<Employee> deleteEmployee(Employee employee);

	
	
}
