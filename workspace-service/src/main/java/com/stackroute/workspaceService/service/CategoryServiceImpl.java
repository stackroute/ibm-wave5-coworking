package com.stackroute.workspaceService.service;

import com.stackroute.workspaceService.domain.Category1;
import com.stackroute.workspaceService.exception.CategoryAlreadyExists;
import com.stackroute.workspaceService.exception.CategoryNotFoundException;
import com.stackroute.workspaceService.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {

        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category1> getAllCategories() {
        return categoryRepository.findAll();

    }

    @Override
    public Category1 saveCategory(Category1 category) throws CategoryAlreadyExists {
        if (categoryRepository.existsByCategoryId(category.getCategoryId()))
            throw new CategoryAlreadyExists("category Already Exists");
        Category1 savedCategory = categoryRepository.save(category);
        return savedCategory;
    }


    @Override
    public boolean deleteCategory(Category1 category) throws Exception {
        if (categoryRepository.existsByCategoryId(category.getCategoryId())) {
            categoryRepository.deleteByCategoryId(category.getCategoryId());
            return true;
        } else {
            throw new Exception("Exception in delete Category");
        }
    }


    @Override
    public Category1 updateCategory(Category1 category) throws CategoryNotFoundException {
        if (categoryRepository.existsByCategoryId(category.getCategoryId())) {
            Category1 saveCategory = categoryRepository.save(category);
            return saveCategory;
        } else {
            throw new CategoryNotFoundException("Category not found");
        }
    }
}

