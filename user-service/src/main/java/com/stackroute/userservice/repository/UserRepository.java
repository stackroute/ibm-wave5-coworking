package com.stackroute.userservice.repository;

import com.stackroute.kafka.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

     void deleteByEmailId(String emailId);
    boolean existsByEmailId(String emailId);

}
