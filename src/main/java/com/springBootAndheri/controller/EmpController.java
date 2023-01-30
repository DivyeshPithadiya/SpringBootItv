package com.springBootAndheri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBootAndheri.models.Employee;
import com.springBootAndheri.services.Services;

@RestController
public class EmpController {

	@Autowired
	Services service;

	@GetMapping("/getemployees")
	public List<Employee> getEmployees() {
		return this.service.getEmployees();
	}

	@PostMapping("/saveemployee")
	public List<Employee> saveEmployee(@RequestBody Employee employee) {
		return this.service.saveEmployee(employee);
	}

	@PutMapping("/updateemployee")
	public List<Employee> updateEmployee(@RequestBody Employee employee) {
		return this.service.updateEmployee(employee);
	}

	@DeleteMapping("/deleteemployee")
	public List<Employee> deleteEmployee(@RequestBody Employee employee) {
		return this.service.deleteEmployee(employee);
	}

}
