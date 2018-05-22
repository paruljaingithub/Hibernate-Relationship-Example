package com.example.demo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user_profession")
public class UserProfessionDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "professioName")
	private String professioName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfessioName() {
		return professioName;
	}

	public void setProfessioName(String professioName) {
		this.professioName = professioName;
	}

	@Override
	public String toString() {
		return "UserProfessionDTO [id=" + id + ", professioName=" + professioName + "]";
	}
	
}
