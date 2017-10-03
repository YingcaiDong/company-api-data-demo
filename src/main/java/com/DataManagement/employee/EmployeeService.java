package com.DataManagement.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employees> getAllEmployees() {
		List<Employees> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}

	public Employees getEmployee(Integer intId) {
		return employeeRepository.findOne(intId);
	}

	public void addEmployee(Employees employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employees employee, Integer intId) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	public void deleteEmployee(Integer intId) {
		// TODO Auto-generated method stub
		employeeRepository.delete(intId);
	}

}
