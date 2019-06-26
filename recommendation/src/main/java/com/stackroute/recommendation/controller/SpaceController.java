package com.stackroute.recommendation.controller;


import com.stackroute.recommendation.domain.Space;
import com.stackroute.recommendation.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "v1/api/space")
public class SpaceController {

    public SpaceService spaceService;

    @Autowired
    public SpaceController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @GetMapping("/{spaceName}")
    public Space findByName(@PathVariable String spaceName) {
        return spaceService.findByName(spaceName);
    }

    //To get all users
    @GetMapping("/allSpace")
    public Collection<Space> getAll() {
        return spaceService.getAll();
    }


    // To create new user
    @PostMapping("/newSpace")
    public Space save(@RequestBody Space space) {
        Space space1 = spaceService.create(space.getSpaceId(),space.getSpaceName());
        return space1;
    }

    //To delete user by id
    @DeleteMapping("/{spaceId}")
    public Space delete(@PathVariable Long spaceId) {
        return spaceService.delete(spaceId);
    }


    //To delete all users
    @DeleteMapping("/gone")
    public String deleteAll() {
        spaceService.deleteAll();
        return "deletedAll";
    }

    //To update user by id
    @PutMapping("/{spaceId}")
    public Space update(@PathVariable long spaceId, @RequestBody Space space) {
        return spaceService.update(spaceId, space.getSpaceName());
    }


}
