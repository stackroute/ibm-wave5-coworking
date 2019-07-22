package com.stackroute.userservice.repository;

import com.stackroute.kafka.domain.MyBookings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface BookingRepository extends MongoRepository<MyBookings, Integer> {
    @Query("{ 'myUser.name': '?0' }")
    List<MyBookings> findByName(String name);
}
