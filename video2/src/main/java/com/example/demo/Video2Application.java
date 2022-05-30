package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Video2Application implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = User.builder()
				.firstName("abc")
				.lastName("pqr")
				.email("abc@pqr.com")
				.build();
		userRepository.save(user1);

		User user2 = User.builder()
				.firstName("lmn")
				.lastName("kgf")
				.email("lmn@kgf.com")
				.build();
		userRepository.save(user2);

		User user3 = User.builder()
				.firstName("hmn")
				.lastName("cvs")
				.email("hmn@cvs.com")
				.build();
		userRepository.save(user3);

		User user4 = User.builder()
				.firstName("akj")
				.lastName("ydu")
				.email("akj@ydu.com")
				.build();
		userRepository.save(user4);

		User user5 = User.builder()
				.firstName("tsh")
				.lastName("udh")
				.email("tsh@udh.com")
				.build();
		userRepository.save(user5);
	}



	public static void main(String[] args) {
		SpringApplication.run(Video2Application.class, args);
	}

}
