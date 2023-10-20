package com.example.demo.Component;

import org.springframework.stereotype.Component;

@Component
public class Course {

	//attributes
	private Long id; 
	private String courseName;
	private String description;
	
	//getter and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
