package com.stackroute.workspaceService.repository;

import com.stackroute.kafka.domain.Space;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpaceRepository extends MongoRepository<Space,Integer> {
    Space findBySpaceName(String spaceName);
   // Space save(Space space);
}
