package com.stackroute.userservice.controller;


import com.stackroute.kafka.domain.*;
import com.stackroute.userservice.exception.SpaceAlreadyExistException;
import com.stackroute.userservice.exception.SpaceNotFound;
import com.stackroute.userservice.service.SpaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1")
public class SpaceController {

    SpaceServiceImpl spaceService;

    @Autowired
    public SpaceController(SpaceServiceImpl spaceService) {
        this.spaceService = spaceService;
    }

    Category category=new Category();
    Location location=new Location();
    Address address=new Address();
    Dimension dimension=new Dimension();
    Amenities amenities=new Amenities();
    User user=new User();

    @PostMapping("/newSpace")
    public ResponseEntity<Space> saveSpace(@RequestBody Space space){
        ResponseEntity responseEntity;
        try {
            user=space.getUser();
            space.setUser(user);

            category = space.getCategory();
            space.setCategory(category);

            location = space.getLocation();
            space.setLocation(location);

            address = space.getAddress();
            space.setAddress(address);

            dimension = category.getDimension();
            category.setDimension(dimension);

            amenities=space.getAmenities();
            space.setAmenities(amenities);

            responseEntity = new ResponseEntity<Space>(spaceService.saveSpace(space), HttpStatus.OK);
        }catch (SpaceAlreadyExistException spacealreadyexist){
            responseEntity=new ResponseEntity(spacealreadyexist.getMessage(),HttpStatus.CONFLICT);
        }
      return responseEntity;
    }

    @GetMapping("/AllSpaces")
    public ResponseEntity<?> getSpace(){
        ResponseEntity responseEntity=new ResponseEntity<List<Space>>(spaceService.getAllSpaces(),HttpStatus.OK);
        return responseEntity;
    }


    @PutMapping("/space")
    public ResponseEntity<?> updateSpace(@RequestBody Space space) {

        ResponseEntity responseEntity;
        try {
            spaceService.update(space);
            responseEntity=new ResponseEntity("Updated",HttpStatus.OK);
        }catch (SpaceNotFound spaceNotFound){
            responseEntity=new ResponseEntity(spaceNotFound.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
    @DeleteMapping("space/{spaceId}")
    public ResponseEntity<?> deleteSpace(@PathVariable int spaceId){
        ResponseEntity responseEntity;
        try {
            spaceService.deleteSpace(spaceId);
            responseEntity=new ResponseEntity("Updated",HttpStatus.OK);
        }catch (SpaceNotFound spaceNotFound){
            responseEntity=new ResponseEntity(spaceNotFound.getMessage(),HttpStatus.CONFLICT);
        }
        return  responseEntity;
    }

    @GetMapping("/{name}")
    public ResponseEntity<Space> getByName(@PathVariable String name){
        ResponseEntity responseEntity=new ResponseEntity<Space>(spaceService.findByName(name),HttpStatus.OK);
        return responseEntity;
    }

}
