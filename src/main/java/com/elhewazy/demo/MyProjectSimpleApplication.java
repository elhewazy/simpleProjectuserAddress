package com.elhewazy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.elhewazy.beans.AddressU;
import com.elhewazy.beans.Users;
import com.elhewazy.repo.AddressRepo;
import com.elhewazy.repo.UserRepo;

@SpringBootApplication
@ComponentScan("com.elhewazy")
@EntityScan("com.elhewazy.beans")
@EnableJpaRepositories("com.elhewazy.repo")
public class MyProjectSimpleApplication implements CommandLineRunner {

	@Autowired
	UserRepo ur;

	@Autowired
	AddressRepo ar;

	public static void main(String[] args) {
		SpringApplication.run(MyProjectSimpleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ur.deleteAll();
		ar.deleteAll();
		AddressU address = new AddressU("goodwin", "plano", "tx", "usa");
		Users user = new Users("ahmed", "ahmed@yahoo.com", 14, address);

		user.setAddress(address);

		ur.save(user);

	}

}
