package com.stackroute.recommendation.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.math.BigDecimal;
import java.util.List;

@NodeEntity
public class Category {

    @GraphId
    private long categoryId;

    @Property
    private String categoryName;
    private double price;
    String space;

    public Category() {
    }

    @Relationship(type = "Located",direction = Relationship.INCOMING)
    private List<Location> locations;

    public Category(long categoryId, String categoryName, double price,String space) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.price = price;
        this.space=space;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public double getPrice() {
        return price;
    }

    public String getSpaceName() {
        return space;
    }
}
