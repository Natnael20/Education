package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Component.Course;
import com.example.demo.Component.Student;

@Repository
public class EducationRepository {
	
	//student lists
	List<Student> students = new ArrayList<>();
	//course lists
	List<Course> courses = new ArrayList<>();
	
	//get all students
	public List<Student> getAllStudents() {
		return students;
	}
		
	//add student
	public Student addStudent(Student student) {
		student.setId((long) (students.size() + 1));
        students.add(student);
		return student;
	}

		//getting students by id
		public Student getStudentById(Long studentId) {
	        // Implement logic to find and return a student by their ID
	        for (Student student : students) {
	            if (student.getId().equals(studentId)) {
	                return student;
	            }
	        }
	        return null; // Student with the given ID not found
	    }

		//
	    public void deleteStudent(Long studentId) {
	        students.removeIf(student -> student.getId().equals(studentId));
	    }
			
		//get all Course
		public List<Course> getAllCourses() {
			return courses;
		}
			
		//add course
		public Course addCoures(Course course) {
			course.setId((long) (courses.size() + 1));
			courses.add(course);
			return course;
		}
		
		//update course
		public Course getCourseById(Long courseId) {
			for(Course course : courses) {
				if(course.getId().equals(courseId)) {
					return course; 
				}
			}
			return null; //course id it not found
		}

		//delete course
	    public void deleteCourse(Long courseId) {
	        courses.removeIf(course -> course.getId().equals(courseId));
	    }
	
}
