package com.example.demo.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usertable")
public class UserDTO implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "userName")
	private String userName;
	
	// For Bidirectional  One to One
	@OneToOne(mappedBy="user", cascade=CascadeType.ALL, fetch= FetchType.LAZY)
	
	private AddressDTO address;
	
	// Single Direction One to One
	@OneToOne(cascade=CascadeType.ALL)
	private UserProfessionDTO userProfession;
	
	@OneToMany(mappedBy= "user", cascade=CascadeType.ALL)
	//@OneToMany(cascade=CascadeType.ALL)
	private List<HobbyDTO> hobbies;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<TaskDTO> tasks;
	
	public UserDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserProfessionDTO getUserProfession() {
		return userProfession;
	}

	public void setUserProfession(UserProfessionDTO userProfession) {
		this.userProfession = userProfession;
	}

	

	public List<HobbyDTO> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<HobbyDTO> hobbies) {
		this.hobbies = hobbies;
	}
	
	

	public List<TaskDTO> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskDTO> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", address=" + address + ", userProfession="
				+ userProfession + ", hobbies=" + hobbies + ", tasks=" + tasks + "]";
	}

}
