package com.example.SpingBootTesting.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name= "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@Column(name="first_name",nullable=false)
	private String firstName;
	@Column(name="last_name",nullable=false)
	private String lastName;
	@Column(name="email",nullable=false)
	private String email;
	
	

}
