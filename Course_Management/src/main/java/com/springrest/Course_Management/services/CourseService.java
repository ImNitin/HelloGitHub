package com.springrest.Course_Management.services;

import java.util.List;

import com.springrest.Course_Management.entity.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCource(long parseLong);
	
}
