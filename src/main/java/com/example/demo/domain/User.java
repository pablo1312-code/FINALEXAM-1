package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "users")
//data annotations indicates lombok library that generates all the getters and setters for this class
@Data
@AllArgsConstructor
public class User {
	
	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	

	// fields
	private long id;
	private String name;
	private String surname;
	private int age;
	private String gender;
	private int phonenumber;
	private String email;
	private String subscription;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setBalance(double d) {
		// TODO Auto-generated method stub
		
	}
	
}


