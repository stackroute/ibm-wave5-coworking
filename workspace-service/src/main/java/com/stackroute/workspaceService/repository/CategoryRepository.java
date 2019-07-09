package com.stackroute.workspaceService.repository;



import com.stackroute.workspaceService.domain.Category1;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category1, String> {
    boolean existsByCategoryId(int categoryId);

    void deleteByCategoryId(int categoryId);


}
