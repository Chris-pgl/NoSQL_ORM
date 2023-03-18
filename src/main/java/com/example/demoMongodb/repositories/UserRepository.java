package com.example.demoMongodb.repositories;

import com.example.demoMongodb.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
