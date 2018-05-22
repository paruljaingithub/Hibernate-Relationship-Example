package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class DepartmentDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iddepartment;
	private String name;
	
	public Long getIddepartment() {
		return iddepartment;
	}
	public void setIddepartment(Long iddepartment) {
		this.iddepartment = iddepartment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
