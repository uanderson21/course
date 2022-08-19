package com.uss.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.uss.course.entities.User;
import com.uss.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Uanderson Santana", "uanderson21@yahoo.com.br", "981057444", "brutal1");
		User u2 = new User(null, "Renata Castro Santana", "rezinhacbu21@yahoo.com.br", "981057445", "brutal2");
		User u3 = new User(null, "Lizzie Castro Santana", "lizzie21@yahoo.com.br", "981057446", "brutal3");		
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}
	
	
}
