package com.example.demo.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Component.Course;
import com.example.demo.Component.Student;
import com.example.demo.Repository.EducationRepository;

@Service
public class EducationService {
	
	@Autowired
	private final EducationRepository educationRepository;

	public EducationService(EducationRepository educationRepository) {
		this.educationRepository = educationRepository;
	}
	//students CRUD operation
	
	//Real all students
	public List<Student> getAllStudents() {
		return educationRepository.getAllStudents();
	}
	
	//create a student
	public Student registerStudent(Student student) {
		return educationRepository.addStudent(student);
	}
	
	//update a student
	public Student updateStudent(Long studentId, Student updatedStudent) {
	    Student existingStudent = educationRepository.getStudentById(studentId);
	    if (existingStudent != null) {
	        existingStudent.setUsername(updatedStudent.getUsername()); // Update the name
	        existingStudent.setAge(updatedStudent.getAge()); // Update the age
	        // Implement updates for other attributes as needed
	        return existingStudent;
	    } else {
	        return null;
	    }
	}
	
	public Student deleteStudent(Long StudentId) {
		Student existingUser = (Student) educationRepository.getAllStudents();
		if(existingUser != null) {
			
			educationRepository.deleteStudent(StudentId);
			return existingUser;
		}
		else {
			return null;
		}
	}
	
	//Course CRUD Operation 
	
	
	//read students
	public List<Course> getAllCourses() {
		return educationRepository.getAllCourses();
	}
	
	//create all courses
	public Course registerCourse(Course course) {
		return educationRepository.addCoures(course);
	}
	
	//update course
	public Course updateCourse(String course, String courseId) {
		Course existingCourse = (Course) educationRepository.getAllCourses();
		if(existingCourse != null) {
			
			existingCourse.setCourseName(courseId);
			
			return existingCourse;
		}
		else {
			return null;
		}
	}
	
	//delete course by id
	public Course deleteCourse(Long courseId) {
		Course existingCourse = (Course) educationRepository.getAllStudents();
		if(existingCourse != null) {
			
			educationRepository.deleteCourse(courseId);;
			return existingCourse;
		}
		else {
			return null;
		} 
	}
	
	//list the courses the students is enrolled
	public List<Course> getCoursesEnrolledByStudent(Long studentId) {
		Student student = educationRepository.getStudentById(studentId);
		if(student != null) {
			return (List<Course>) student.getEnrolled();
		}
		else {
			return Collections.emptyList();
		}
	}

}
