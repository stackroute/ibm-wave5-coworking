package com.stackroute.recommendation.domain;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Space {

    @GraphId
    private long spaceId;

    @Property
    private String spaceName;
   // private String location;


    @Relationship(type = "Contains",direction = Relationship.INCOMING)
    private List<Category> category;

    @Relationship(type = "Located",direction = Relationship.INCOMING)
    private List<Location> locations;

//    public List<Category> getCategory() {
//        return category;
//    }
//
//    public List<Location> getLocations() {
//        return locations;
//    }

    public Space() {
    }

    public Space(long spaceId, String spaceName) {
        this.spaceId = spaceId;
        this.spaceName = spaceName;
//        this.category = category;
//        this.locations = locations;
    }

    public long getSpaceId() {
        return spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

   // public String getLocation() {
   //     return location;
    //}

}
