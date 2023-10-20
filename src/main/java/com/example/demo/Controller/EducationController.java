package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Component.Course;
import com.example.demo.Component.Student;
import com.example.demo.Service.EducationService;

@RestController
public class EducationController {
	
	@Autowired
	public final EducationService educationService;

	public EducationController(EducationService educationService) {
		this.educationService = educationService;
	}
	
	//endpoint
	@GetMapping
	public String display() {
		return "hello world";
	}
	
	//list all the students
	@GetMapping
	public List<Student> getAllStudents() {
		return educationService.getAllStudents();
	}
	
	//add student
	//form sign in
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return educationService.registerStudent(student);
	}
	
	@PutMapping
	public Student updateStudent(@PathVariable Long studentId, @RequestBody Student updatedStudent) {
	    return educationService.updateStudent(studentId, updatedStudent);
	}
	
	@DeleteMapping
	public Student deleteStudent(@PathVariable Long studentId) {
		return educationService.deleteStudent(studentId);
	}
	
	@GetMapping
	public Course getAllCourseStudentsRolled(@PathVariable Long studentId) {
		return (Course) educationService.getCoursesEnrolledByStudent(studentId);
	}

}
