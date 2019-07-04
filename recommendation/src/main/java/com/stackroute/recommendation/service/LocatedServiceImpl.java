package com.stackroute.recommendation.service;


import com.stackroute.recommendation.domain.Category;
import com.stackroute.recommendation.domain.Space;
import com.stackroute.recommendation.repository.LocatedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class LocatedServiceImpl implements LocatedService {

    LocatedRepository locatedRepository;

    @Autowired
    public LocatedServiceImpl(LocatedRepository locatedRepository) {
        this.locatedRepository = locatedRepository;
    }

    @Override
    public Collection<Space> getRelationship() {
        return locatedRepository.getRelationship();
    }

    @Override
    public Space createRelationship(String spaceName, String locationName) {
        return locatedRepository.createRelationship(spaceName,locationName);
    }

    @Override
    public Category createRelationshipLoc(String categoryName, String locationName) {
        return locatedRepository.createRelationshipLoc(categoryName,locationName);
    }

    @Override
    public Category deleteRelationshipcat() {
        return locatedRepository.deleteRelationshipcat();
    }

    @Override
    public Space deleteRelationship() {
        return locatedRepository.deleteRelationship();
    }

    @Override
    public Collection<Space> createRecommendationLoc() {
//        ArrayList<String> list=locatedRepository.getCategoryName();
//        System.out.println(list);
//        ArrayList<String> list1=locatedRepository.getAllCategoryName();
//        for(int i=0;i<list.size();i++) {
//            for (int j = 0; j < list1.size(); j++) {
//                if (list1.get(i)==list.get(j)) {
//                    System.out.println(list1.get(i));
                    return locatedRepository.createRecommendationloc();
//                }
//            }
//        }
//        return null;
    }
}
