package com.p1.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
