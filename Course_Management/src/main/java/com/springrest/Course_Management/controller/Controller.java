package com.springrest.Course_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.Course_Management.entity.Course;
import com.springrest.Course_Management.services.CourseService;

@RestController
public class Controller {
	
	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/hello")
	public String home() {
		return "Hello welcome";
	}
	
	//get courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
		
	}
	
	//getCourse by id
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));	
	}
	
	//add Course
	@PostMapping("/addcourse")
	public Course addCouser(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	
	//update the Course
	@PutMapping("/updateCourse")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	//delete the course
	@DeleteMapping("/delcourses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseService.deleteCource(Long.parseLong(courseId));	
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		
	}
}