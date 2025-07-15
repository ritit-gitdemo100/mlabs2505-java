package com.mlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mlabs.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
