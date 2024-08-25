package com.SMongodb.spring_boot_starter_mongodb.repository;


import com.SMongodb.spring_boot_starter_mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
