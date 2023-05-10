package com.example.examcontrol.Repositories;

import com.example.examcontrol.Models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends MongoRepository<Users, String> {
    Users findByUsername(String s);
}
