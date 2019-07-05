package com.stackroute.userservice.repository;

import com.stackroute.kafka.domain.Space;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpaceRepository extends MongoRepository<Space,Integer> {
}
