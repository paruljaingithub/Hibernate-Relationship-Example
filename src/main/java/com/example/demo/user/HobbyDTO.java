package com.example.demo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "hobby")
public class HobbyDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "hobyName")
	private String hobyName;
	
	@ManyToOne
	@JsonIgnore
	private UserDTO user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHobyName() {
		return hobyName;
	}

	public void setHobyName(String hobyName) {
		this.hobyName = hobyName;
	}
	
	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "HobbyDTO [id=" + id + ", hobyName=" + hobyName + ", user=" + user + "]";
	}

}
