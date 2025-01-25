package com.example.SpingBootTesting.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpingBootTesting.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> findByEmail(String email);

}
