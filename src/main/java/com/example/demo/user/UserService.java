package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private EntityManager entityManager;

	public void saveUser() {

		UserDTO user = new UserDTO();
		user.setUserName("Parul");
		AddressDTO address = new AddressDTO();
		address.setCity("Pune");
		address.setUser(user);
		user.setAddress(address);
		UserProfessionDTO userProfession = new UserProfessionDTO();
		userProfession.setProfessioName("Doctor");
		user.setUserProfession(userProfession);

		HobbyDTO hobby = new HobbyDTO();
		hobby.setHobyName("Singing");
		hobby.setUser(user);

		HobbyDTO hobbyTwo = new HobbyDTO();
		hobbyTwo.setHobyName("Listening Songs");
		hobbyTwo.setUser(user);

		List<HobbyDTO> hobbies = new ArrayList<>();
		hobbies.add(hobby);
		hobbies.add(hobbyTwo);
		
		TaskDTO task = new TaskDTO();
		task.setTaskName("call");
		
		TaskDTO task1 = new TaskDTO();
		task1.setTaskName("Message");
		
		List<TaskDTO> tasks = new ArrayList<>();
		tasks.add(task);
		tasks.add(task1);
		user.setTasks(tasks);
		user.setHobbies(hobbies);
		userRepository.save(user);

	}

	public List<UserDTO> getUsers() {

		List<UserDTO> users = new ArrayList<>(); 

		// System.out.println("all users:::::::" +
		// this.userRepository.findAll());
		this.userRepository.findAll().forEach(users::add);

		return users;
	}
}
