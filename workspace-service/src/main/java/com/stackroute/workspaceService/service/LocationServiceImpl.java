package com.stackroute.workspaceService.service;
import com.stackroute.workspaceService.exception.LocationAlreadyExists;
import com.stackroute.workspaceService.exception.LocationNotFoundException;
import com.stackroute.workspaceService.repository.LocationRepository;
import com.stackroute.workspaceService.domain.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    LocationRepository locationRepository;
    LocationService locationService;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {

        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getLocation() {
        return locationRepository.findAll();

    }

    @Override
    public Location saveLocation(Location location) throws LocationAlreadyExists {
        if (locationRepository.existsByLocationName(location.getLocationName()))
            throw new LocationAlreadyExists("location Already Exists");

        Location savedCategory = locationRepository.save(location);
        return savedCategory;
    }

    @Override
    public boolean deleteLocation(Location location) throws Exception {
        if (locationRepository.existsByLocationName(location.getLocationName())) {
            locationRepository.deleteByLocationName(location.getLocationName());
            return true;
        } else {
            throw new Exception("Location you want to delete is not exist");
        }
    }

    @Override
    public Location updateLocation(Location location) throws LocationNotFoundException {
        if (locationRepository.existsByLocationName(location.getLocationName())) {
            Location saveLocation = locationRepository.save(location);
            return saveLocation;
        } else {
            throw new LocationNotFoundException("Location not found");
        }
    }
}

