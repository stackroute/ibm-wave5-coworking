package com.stackroute.kafka.domain;

import com.stackroute.workspaceService.domain.Category1;
import com.stackroute.workspaceService.service.CategoryService;
import com.stackroute.workspaceService.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

public class Consumer {
    private CategoryService categoryService;
    private SpaceService spaceService;

//    @Autowired
//    public Consumer(CategoryService categoryService) {
//        this.categoryService = categoryService;
//    }

    @Autowired
      public Consumer(){
        this.spaceService = spaceService;
    }

//    Category1 category1= new Category1();
    Space space=new Space();

    @KafkaListener(topics = "spaceTopic")
    public void receive(@Payload Space space){

        try{
           // categoryService.saveCategory(category1);
            spaceService.saveSpace(space);
            System.out.println(space.toString());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(space.toString());

    }

}

