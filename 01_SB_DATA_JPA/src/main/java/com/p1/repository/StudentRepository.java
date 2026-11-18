package com.p1.repository;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
//	Find By'
	
//	List<Student> findByName(String name);
//	
//	List<Student> findByDepartment(String department);
//	
	List<Student> findByAge(Integer age);
	
	List<Student> findByAgeOrderByAgeAsc(Integer age);
	
	   List<Student> findByDepartmentOrderByMarksAsc(String department);
	
	   
//	   DESC
	   List<Student> findByAgeOrderByAgeDesc(Integer age);

	    List<Student> findByDepartmentOrderByMarksDesc(String department);
	
//	
	    
	    List<Student> findByDepartmentAsc(String department);
	    
	    // Pagination
	    Page<Student> findByDepartment(String department, Pageable pageable);

}
