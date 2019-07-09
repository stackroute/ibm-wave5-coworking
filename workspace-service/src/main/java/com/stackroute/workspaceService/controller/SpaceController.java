package com.stackroute.workspaceService.controller;

import com.stackroute.kafka.domain.Space;
import com.stackroute.workspaceService.service.SpaceService;
import com.stackroute.workspaceService.service.SpaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/v1")
public class SpaceController {
    SpaceService spaceService;

    @Autowired
    public SpaceController(SpaceService spaceService) {

        this.spaceService = spaceService;
    }

    @PostMapping("savespace")
    public ResponseEntity<?> saveSpace(@RequestBody Space space){
        ResponseEntity responseEntity = new ResponseEntity<Space>(spaceService.saveSpace(space), HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("space/{name}")
    public ResponseEntity<?> getByName(@PathVariable String spaceName){
        ResponseEntity responseEntity=new ResponseEntity<Space>(spaceService.findBySpaceName(spaceName), HttpStatus.OK);
        return responseEntity;
    }
}
