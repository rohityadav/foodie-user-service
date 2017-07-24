package com.foodie.user.foodieuserservice.model;

import lombok.*;

import java.io.Serializable;
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
}
