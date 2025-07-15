package com.mlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mlabs.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
