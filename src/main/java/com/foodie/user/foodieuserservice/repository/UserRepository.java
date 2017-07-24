package com.foodie.user.foodieuserservice.repository;

import com.foodie.user.foodieuserservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by ryadav1 on 7/21/17.
 */
@RepositoryRestResource
public interface UserRepository extends MongoRepository<User, String> {
    @RestResource(path = "by-username")
    public List<User> findByFirstName(@Param("userId") String userId);
}