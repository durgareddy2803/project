package com.example.SpingBootTesting.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.SpingBootTesting.Exception.EmployeeException;
import com.example.SpingBootTesting.Repository.EmployeeRepository;
import com.example.SpingBootTesting.model.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired 
	private EmployeeRepository employeeRepository;
	
	@Override
    public Employee saveEmployee(Employee employee) throws EmployeeException {
        Optional<Employee> existingEmployee = employeeRepository.findByEmail(employee.getEmail());
        if (existingEmployee.isPresent()) {
            throw new EmployeeException("Employee already exists with email: " + employee.getEmail());
        }
        return employeeRepository.save(employee);
    }

}
