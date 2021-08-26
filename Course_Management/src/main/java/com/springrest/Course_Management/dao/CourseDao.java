package com.springrest.Course_Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.Course_Management.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

	
}
