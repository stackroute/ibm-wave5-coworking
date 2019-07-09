package com.stackroute.workspaceService.controller;

import com.stackroute.workspaceService.domain.*;
import com.stackroute.workspaceService.exception.CategoryAlreadyExists;
import com.stackroute.workspaceService.exception.CategoryNotFoundException;
import com.stackroute.workspaceService.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/api/v1")
public class CategoryController {

    CategoryService categoryService;
    MySpace mySpace = new MySpace();
    Address address = new Address();
    Dimension dimension = new Dimension();
    Location location = new Location();


    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("category")
    public ResponseEntity<?> saveCategory(@RequestBody Category1 category) throws CategoryAlreadyExists {
        System.out.println("Category Object:" + category.toString());
        ResponseEntity responseEntity;
        mySpace = category.getMySpace();
        category.setMySpace(mySpace);
        address = category.getAddress();
        category.setAddress(address);
        dimension = category.getDimension();
        category.setDimension(dimension);
        location = category.getLocation();


        category.setLocation(location);
        try {
            categoryService.saveCategory(category);
            responseEntity = new ResponseEntity<String>(" Category Successfully Saved", HttpStatus.CREATED);
        } catch (CategoryAlreadyExists ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;


    }


    @GetMapping("category")
    public ResponseEntity<?> getAllCategories() {
        return new ResponseEntity<List<Category1>>(categoryService.getAllCategories(), HttpStatus.OK);
    }


    @PatchMapping("category")
    public ResponseEntity<?> updateCategory(@RequestBody Category1 category) throws CategoryNotFoundException {
        ResponseEntity responseEntity;
        try {
            categoryService.updateCategory(category);
            responseEntity = new ResponseEntity<String>(" category Updated Successfully", HttpStatus.CREATED);
        } catch (CategoryNotFoundException exception) {
            responseEntity = new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }


    @DeleteMapping("category")
    public ResponseEntity<String> deleteCategory(@RequestBody Category1 category) {
        ResponseEntity responseEntity;
        try {
            boolean answer = categoryService.deleteCategory(category);
            return new ResponseEntity<String>(" Category Successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
            e.printStackTrace();
        }
        return responseEntity;
    }
}



