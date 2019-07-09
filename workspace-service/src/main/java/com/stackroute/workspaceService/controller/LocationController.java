package com.stackroute.workspaceService.controller;

import com.stackroute.kafka.domain.Space;
import com.stackroute.workspaceService.exception.LocationNotFoundException;
import com.stackroute.workspaceService.domain.Address;
import com.stackroute.workspaceService.domain.Dimension;
import com.stackroute.workspaceService.domain.Location;
import com.stackroute.workspaceService.exception.LocationAlreadyExists;
import com.stackroute.workspaceService.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class LocationController {

    LocationService locationService;
    Space space = new Space();
    Address address = new Address();
    Dimension dimension = new Dimension();
//    Category category=new Category();

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("location")
    public ResponseEntity<?> saveLocation(@RequestBody Location location) throws LocationAlreadyExists {
        System.out.println("Location Object:" + location.toString());
//        space = location.getSpace();
//        location.setSpace(space);
        address = location.getAddress();
        location.setAddress(address);
        dimension = location.getDimension();
        location.setDimension(dimension);
//        category = location.getCategory();
//        location.setCategory(category);
        ResponseEntity responseEntity;
        try {
            locationService.saveLocation(location);
            responseEntity = new ResponseEntity<String>(" Location Successfully Saved", HttpStatus.CREATED);

        } catch (LocationAlreadyExists ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);

        }
        return responseEntity;


    }


    @GetMapping("location")
    public ResponseEntity<?> getLocation() {
        return new ResponseEntity<List<Location>>(locationService.getLocation(), HttpStatus.OK);
    }


    @PatchMapping("location")
    public ResponseEntity<?> updateLocation(@RequestBody Location location) throws LocationNotFoundException {
        ResponseEntity responseEntity;
        try {
            locationService.updateLocation(location);
            responseEntity = new ResponseEntity<String>(" location Updated Successfully", HttpStatus.CREATED);
        } catch (LocationNotFoundException exception) {
            responseEntity = new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }


    @DeleteMapping("location")
    public ResponseEntity<String> deleteLocation(@RequestBody Location location) {
        ResponseEntity responseEntity;
        try {
            boolean answer = locationService.deleteLocation(location);
            return new ResponseEntity<String>(" Location Successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
            e.printStackTrace();
        }
        return responseEntity;
    }
}



