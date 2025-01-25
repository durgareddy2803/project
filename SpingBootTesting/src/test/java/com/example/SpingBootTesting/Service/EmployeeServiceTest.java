package com.example.SpingBootTesting.Service;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.SpingBootTesting.Exception.EmployeeException;
import com.example.SpingBootTesting.Repository.EmployeeRepository;
import com.example.SpingBootTesting.model.Employee;

@SpringBootTest
public class EmployeeServiceTest {
	
	@Mock
	private EmployeeRepository employeeRepository;
	@InjectMocks
	private EmployeeServiceImpl employeeService;
	
	@Test
	public void givenEmployeeObject_whenSaveEmployee_thenReturnEmployee() throws EmployeeException {
		//given -precondition or setup
		Employee employee = new Employee();
		employee.setFirstName("reddy");
		employee.setLastName("durga");
		employee.setEmail("durga.reddy@gmail.com");
		
		Mockito.when(employeeRepository.findByEmail(employee.getEmail())).thenReturn(Optional.empty());
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);

		
		//when  -action or the behavior that we are going to test
		
		Employee savedEmployee = employeeService.saveEmployee(employee);
		//then -verify the output
		Assertions.assertThat(savedEmployee).isNotNull();

	}

}
