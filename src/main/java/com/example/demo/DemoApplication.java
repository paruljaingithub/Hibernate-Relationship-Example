package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
@EntityScan
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// Demo for bidirectional mapping ------------> Please refer UserDTO and addressDTO
		// Bidirectional OneToOne mapping
		// it means parent class object will be created in child table
		/*
		 // in child class
		  @OneToOne
	      UserDTO user;
        */
		
        /*
         // in parent class
          @OneToOne(mappedBy="user", cascade=CascadeType.ALL)
	      private AddressDTO address;
         */
		
		/* 
		 * 
		 * 
			//This is how we can save the parent entity 
			UserDTO user = new UserDTO();
			user.setUserName("Parul");
			AddressDTO address = new AddressDTO();
			address.setCity("Pune");
			address.setUser(user);
			user.setAddress(address);
			userRepository.save(user);
		 */
         
	}
}
