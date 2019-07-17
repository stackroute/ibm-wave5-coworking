package com.stackroute.recommendation.service;


import com.stackroute.recommendation.domain.Location;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface LocationService {

    public Location findByName(String locationName);
    public Collection<Location> getAll();
    public Location create(long locationId, String locationName, double latitude, double longitude);
    public Location delete(Long locationId);
    public Location deleteAll();
    public Location update(long locationId, String locationName);
}
