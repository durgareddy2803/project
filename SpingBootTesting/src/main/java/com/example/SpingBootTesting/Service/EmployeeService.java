package com.example.SpingBootTesting.Service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpingBootTesting.Exception.EmployeeException;
//import com.example.SpingBootTesting.Repository.EmployeeRepository;
import com.example.SpingBootTesting.model.Employee;

@Service
public interface EmployeeService {

	
	Employee saveEmployee(Employee employee) throws EmployeeException;
	
	
	
}
