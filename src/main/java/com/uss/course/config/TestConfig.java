package com.uss.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.uss.course.entities.Order;
import com.uss.course.entities.User;
import com.uss.course.repositories.OrderRepository;
import com.uss.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Uanderson Santana", "uanderson21@yahoo.com.br", "981057444", "brutal1");
		User u2 = new User(null, "Renata Castro Santana", "rezinhacbu21@yahoo.com.br", "981057445", "brutal2");
		User u3 = new User(null, "Lizzie Castro Santana", "lizzie21@yahoo.com.br", "981057446", "brutal3");		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		Order o4 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u3);			
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
	}
	
	
}
