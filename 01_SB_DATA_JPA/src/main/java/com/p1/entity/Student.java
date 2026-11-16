package com.p1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="students")
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String name;
	@Column(nullable = false,unique = true, length = 150)
	private String email;
	private Integer age;
	
	private String department;
	private Double marks;
	public Student(String name, String email, Integer age, String department, Double marks) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.department = department;
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", department="
				+ department + ", marks=" + marks + "]";
	}


	public Student() {
		super();
	}


	public Student(Long id, String name, String email, Integer age, String department, Double marks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.department = department;
		this.marks = marks;
	}
	
	
	
	

}
