package com.foodie.user.foodieuserservice.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ryadav1 on 7/21/17.
 */
@Getter @Setter
@ToString
public class User implements Serializable{
    private String id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> foodChoices;

    public User() {
    }

    public User(String userId, String firstName, String lastName, List<String> foodChoices) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.foodChoices = foodChoices;
    }


    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("rohityadav85", "Rohit", "Yadav", Arrays.asList(new String[]{"Indian", "Chinese"}));
        System.out.println(objectMapper.writeValueAsString(user));


    }
}
