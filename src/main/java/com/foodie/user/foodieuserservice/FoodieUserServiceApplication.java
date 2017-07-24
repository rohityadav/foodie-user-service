package com.foodie.user.foodieuserservice;

import com.foodie.user.foodieuserservice.model.User;
import com.foodie.user.foodieuserservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories
public class FoodieUserServiceApplication {

    @Autowired
    private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(FoodieUserServiceApplication.class, args);
	}


}
