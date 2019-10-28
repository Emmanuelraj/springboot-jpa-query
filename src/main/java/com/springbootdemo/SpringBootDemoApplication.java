package com.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootdemo.interfaces.UserJpaRepository;
import com.springbootdemo.model.User;

@SpringBootApplication
public class SpringBootDemoApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	
	@Autowired
	private UserJpaRepository userJpaRepo;
	
	
	@Override
	public void run(String... args) throws Exception 
	{
	   User user = new User(1l,"imman","devOps",1000);
	   User user1 = new User(2l,"ram","devOps",2000);
	   User user2 = new User(3l,"immanu","devOps",1000);
	   
	   userJpaRepo.save(user);
	   userJpaRepo.save(user1);
	   userJpaRepo.save(user2);
	   
	}

}

