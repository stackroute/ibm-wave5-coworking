package com.stackroute.workspaceService.service;



import com.stackroute.workspaceService.domain.Category1;
import com.stackroute.workspaceService.exception.CategoryAlreadyExists;
import com.stackroute.workspaceService.exception.CategoryNotFoundException;

import java.util.List;

public interface CategoryService {
    public List<Category1> getAllCategories();
    public Category1 saveCategory(Category1 category) throws CategoryAlreadyExists;
    public boolean deleteCategory(Category1 category) throws Exception;
    public Category1 updateCategory(Category1 category) throws CategoryNotFoundException;
}
