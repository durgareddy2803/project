package com.example.SpingBootTesting.Repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.SpingBootTesting.model.Employee;

@DataJpaTest
public class EmployeeRespositoryTests {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Junit test for save employee
	@Test
	public void givenEmployeeObject_whenSave_thenReturnSavedEmployee() {
		
		//given --precondition or setup
		Employee employee = new Employee();
						employee.setFirstName("dura");
						employee.setLastName("reddy");
						employee.setEmail("durga.satti@gmail.com");
						
				
		//when  -action or the behavior that we are going to test
		Employee savedEmployee =employeeRepository.save(employee);
						
		//then -verify the output
		Assertions.assertThat(savedEmployee).isNotNull();
		Assertions.assertThat(savedEmployee.getId()).isGreaterThan(0);
		
	}
	@Test
	public void givenEmployeeList_whenFindAll_thenReturnEmployeeList() {
		//given -precondition or setup
		Employee employee = new Employee();
		employee.setFirstName("dura");
		employee.setLastName("reddy");
		employee.setEmail("durga.reddy@gmail.com");
		
		Employee employee1 = new Employee();
		employee1.setFirstName("dura");
		employee1.setLastName("satti");
		employee1.setEmail("durga.satti@gmail.com");
//		Employee savedEmployee =employeeRepository.save(employee);
		
		employeeRepository.save(employee);
		employeeRepository.save(employee1);

		//when  -action or the behavior that we are going to test
		List<Employee> employeeList = employeeRepository.findAll();
		//then -verify the output
		Assertions.assertThat(employeeList).isNotNull();
		Assertions.assertThat(employeeList.size()).isEqualTo(2);
	}
	
}
