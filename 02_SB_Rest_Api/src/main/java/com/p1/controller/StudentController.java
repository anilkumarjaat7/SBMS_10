package com.p1.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.entity.Student;
import com.p1.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private StudentService service;
	
	
	
	
public StudentController(StudentService service) {
		super();
		this.service = service;
	}


//	create Student
	
	@PostMapping("/")
	public String saveStudent(@RequestBody Student student) {
		
		   service.saveStudent(student);
		   
		   return  "Student store into database";
		
	}
	
//	Get All Student From Data Base 
	@GetMapping("/")
	public List<Student> getAllStudent() {
		return service.getAllStudents();
	}
	
	
//	get Student By Id

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return service.getStudentById(id);
	}
	
	
//	delete Student By Id
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		service.deleteStudent(id);
		
		return "Student delete Successfully";
	}
}
