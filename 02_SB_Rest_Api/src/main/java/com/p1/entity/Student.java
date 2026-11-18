package com.p1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="students")
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Setter
//@Getter

public class Student {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String course;
	
	private double fees;
	
	

	public Student(String name, String email, String course, double fees) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		this.fees = fees;
	}

	public Student() {
		super();
	}

	public Student(Integer id, String name, String email, String course, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
		this.fees = fees;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", course=" + course + ", fees=" + fees
				+ "]";
	}
	
	
	
	
	
}
