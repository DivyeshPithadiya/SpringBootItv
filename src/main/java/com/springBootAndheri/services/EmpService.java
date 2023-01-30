package com.springBootAndheri.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springBootAndheri.models.Employee;

@Service
public class EmpService implements Services {

	List<Employee> employees = new ArrayList<>();

	public EmpService() {
		employees.add(new Employee(1, "Divyesh", "Pithadiya", "divyesh@gmail.com"));
		employees.add(new Employee(2, "Mihir", "Parmar", "mihir@gmail.com"));
	}

	@Override
	public List<Employee> getEmployees() {
		return this.employees;
	}

	@Override
	public List<Employee> saveEmployee(Employee employee) {
		employees.add(employee);
		return this.employees;
	}

	@Override
	public List<Employee> updateEmployee(Employee employee) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getId() == employee.getId()) {
				employees.get(i).setName(employee.getName());
				employees.get(i).setSurname(employee.getSurname());
				employees.get(i).setEmail(employee.getEmail());
				break;
			}
		}
		return this.employees;
	}

	@Override
	public List<Employee> deleteEmployee(Employee employee) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getId() == employee.getId()) {
				employees.remove(employees.get(i));
				break;
			}
		}

		return this.employees;
	}

}
