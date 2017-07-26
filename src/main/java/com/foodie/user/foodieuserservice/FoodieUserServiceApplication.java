package com.foodie.user.foodieuserservice;

import com.foodie.user.foodieuserservice.model.User;
import com.foodie.user.foodieuserservice.repository.UserRepository;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories
public class FoodieUserServiceApplication {
    @Value("${spring.data.mongo.host}")
    private String host;
    @Value("${spring.data.mongo.db}")
    private String db;
    @Bean
    public MongoClient mongo(){
        return new MongoClient(host);
    }

    @Bean
    @DependsOn("mongo")
    public MongoDbFactory mongoDbFactory(){
        return new SimpleMongoDbFactory(mongo(),db);
    }

    @Autowired
    private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(FoodieUserServiceApplication.class, args);
	}


}
