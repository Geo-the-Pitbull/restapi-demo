package com.research.restapidemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.research.restapidemo.entities.Role;
import com.research.restapidemo.entities.User;
import com.research.restapidemo.repository.UserRepository;

@SpringBootApplication
public class RestapiDemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestapiDemoApplication.class, args);
	}

	public void run(String... arg) {
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if(null == adminAccount){
			User user = new User();

			user.setEmail("geovauniegolding@gmail.com");
			user.setFirstname("Geovaunie");
			user.setSecondname("Golding");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(user);
		}
	}

}
