package com.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.p1.entity.Student;
import com.p1.repository.StudentRepository;

@SpringBootApplication
public class Application {

	

	private final StudentRepository studentRepository;

	Application(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	StudentRepository bean = context.getBean(StudentRepository.class);
	
	
//	save
//	<S extends T> S save(S entity);
	
//	Student stu = bean.save(new Student( "Anil", "anil@gmail.com",25, "Java", 90.0));
//	System.out.println(stu);
	
	
//	Student s2 = new Student(
//             "Rahul", "rahul1@gmail.com",
//            22, "Python", 85.0
//    );
//
//    Student s3 = new Student(
//             "Amit", "amit1@gmail.com",
//            24, "Java", 78.0
//    );
//
//    Student s4 = new Student(
//             "Priya", "priya1@gmail.com",
//            21, "MERN", 95.0
//    );
//
//    Student s5 = new Student(
//             "Rohit", "rohit1@gmail.com",
//            25, "Python", 88.0
//    );
//    
//    List<Student> saveAll = bean.saveAll(Arrays.asList(s2,s3,s4,s5));
//    
//   System.out.println("student store into data base");
//	
//	
//	Find 
	
//    List<Student> allStudents = bean.findAll();
//
//    
//   for(Student stu : allStudents) {
//	   System.out.println(stu);
//   }
//    System.out.println("All Students: " + allStudents);
	
	
//	Optional<Student> stu = bean.findById(9L);	
//	System.out.println(stu);
	
	
//	long count = bean.count();
//	System.out.println(count);
	
//	if(bean.existsById(1L)) {
//		bean.deleteById(1L);
//		System.out.println("Delete Student");
//	}else {
//		System.out.println("Student not exits");
//	}
	
	
//	bean.deleteAll();
	
	
	
//	findBy non primary key column ke bases pr find kr skte h 
	
//	List<Student> StudentbyName = bean.findByName("rahul");
//	
//	System.out.println(StudentbyName);
	
	
//List<Student> StudentbyDep = bean.findByDepartment("Python");
//	
//	System.out.println(StudentbyDep);
	
//	List<Student> students =
//		    bean.findByDepartmentOrderByMarksAsc("Python");
//	
//	System.out.println(students);
	
	
//	List<Student> students =
//		    bean.findByAgeOrderByAgeAsc(25);
	
//	List<Student> students =
//		    bean.findByDepartmentOrderByMarksDesc("Java");
	
//	Pageable pageable = PageRequest.of(0, 5);
//	
//	
//	Page<Student> page = bean.findAll(pageable);
	
	
	students.forEach((s)->System.out.println(s));
	
	
	
	
	 
	}

}
