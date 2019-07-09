package com.stackroute.workspaceService.repository;


import com.stackroute.workspaceService.domain.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {
    boolean existsByLocationName(String locationName);

    void deleteByLocationName(String locationName);


}

