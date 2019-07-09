package com.stackroute.workspaceService.service;

import com.stackroute.workspaceService.exception.LocationAlreadyExists;
import com.stackroute.workspaceService.exception.LocationNotFoundException;
import com.stackroute.workspaceService.domain.Location;

import java.util.List;
public interface LocationService {
    List<Location> getLocation();

    Location saveLocation(Location location) throws LocationAlreadyExists;

    boolean deleteLocation(Location location) throws Exception;

    Location updateLocation(Location location) throws LocationNotFoundException;
}


