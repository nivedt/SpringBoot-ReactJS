package com.ttechlab.restapiExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ttechlab.restapiExample.dao.UserRepository;
import com.ttechlab.restapiExample.entity.User;

@SpringBootApplication
public class RestApiExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApiExampleApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.userRepository.save(new User("Niveditha", "T", "niveditha@gmail.com"));
		this.userRepository.save(new User("Nyvedhya", "Kapoor", "nyvedhya@gmail.com"));
		this.userRepository.save(new User("Riya", "Thakur", "riya@gmail.com"));
	}

}
