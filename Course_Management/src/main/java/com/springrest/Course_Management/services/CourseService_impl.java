package com.springrest.Course_Management.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Course_Management.dao.CourseDao;
import com.springrest.Course_Management.entity.Course;

@Service
public class CourseService_impl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	
	@Override
	public List<Course> getCourses() {	
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {	
		return courseDao.findById(courseId).get();										
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return  course;
	}

	@Override
	public void deleteCource(long parseLong) {
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
