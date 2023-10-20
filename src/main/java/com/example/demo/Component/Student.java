package com.example.demo.Component;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Long id;
	private String username;
	private int age;
	private LocalDate birthDate;
	private Course enrolled;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public Course getEnrolled() {
		return enrolled;
	}
	public void setEnrolled(Course enrolled) {
		this.enrolled = enrolled;
	}
}
