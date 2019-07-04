package com.stackroute.recommendation.domain;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Collection;
import java.util.List;

@NodeEntity
public class Space {

    @GraphId
    private long spaceId;

    @Property
    private String spaceName;

   // private String location;
//    Category category1=new Category();
//    private String categoryName=category1.getCategoryName();
//
//    public Collection<String> getCategory() {
//        return category;
//    }
//
//    public void setCategory(Collection<String> category) {
//        this.category = category;
//    }

    @Relationship(type = "Contains",direction = Relationship.INCOMING)
    private Collection<String> category;

    @Relationship(type = "Located",direction = Relationship.INCOMING)
    private List<Location> locations;


    public Space() {
    }

    public Space(long spaceId, String spaceName) {
        this.spaceId = spaceId;
        this.spaceName = spaceName;
    }
    public long getSpaceId() {
        return spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }


}
