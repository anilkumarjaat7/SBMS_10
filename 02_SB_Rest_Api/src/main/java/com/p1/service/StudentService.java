package com.p1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.p1.entity.Student;
import com.p1.repositrory.StudentRepository;

@Service
public class StudentService {
	
	
	private StudentRepository repo;

	
	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}
	
    // Create Student
    public Student saveStudent(Student student) {
    	
    	return repo.save(student);
    }
    
    
//    find All Student
    public List<Student> getAllStudents(){
    	return repo.findAll();
    }
    
//  find By ID  Student
  public Student getStudentById(Integer id){
  	return repo.findById(id).orElse(null);
  }  
	
	
  
  public void deleteStudent(Integer id) {
	   repo.deleteById(id);
  }
	

}
