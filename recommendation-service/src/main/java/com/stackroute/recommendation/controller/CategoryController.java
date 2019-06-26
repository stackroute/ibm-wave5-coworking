package com.stackroute.recommendation.controller;


import com.stackroute.recommendation.domain.Category;
import com.stackroute.recommendation.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import java.util.Collection;

@RestController
@RequestMapping(value = "v1/api/category")
public class CategoryController {

    public CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{categoryName}")
    public Category getByName(@PathVariable String categoryName) {
        return categoryService.findByName(categoryName);
    }

    //To get all users
    @GetMapping("/allCategory")
    public Collection<Category> getAll() {
        return categoryService.getAll();
    }


   // To create new user
    @PostMapping("/newCategory")
    public Category save(@RequestBody Category category) {
        Category category1 = categoryService.create(category.getCategoryId(), category.getCategoryName(), category.getPrice(),category.getSpaceName());
        return category1;
    }

    //To delete user by id
    @DeleteMapping("/{categoryId}")
    public Category delete(@PathVariable Long categoryId) {
        return categoryService.delete(categoryId);
    }


    //To delete all users
    @DeleteMapping("/gone")
    public String deleteAll() {
        categoryService.deleteAll();
        return "deletedAll";
    }

    //To update user by id
    @PutMapping("/{categoryId}")
    public Category update(@PathVariable long categoryId, @RequestBody Category category) {
        return categoryService.update(categoryId, category.getCategoryName(), category.getPrice());
    }

}
