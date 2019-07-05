package com.stackroute.kafka.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Space {


    private Location location;
    private Address address;
    private Category category;

    private Amenities amenities;




    @Id
    int spaceId;
    String spaceName;
    String spaceImageUrl;
    BigDecimal totalprice;

    public Space() {
    }

    public Space(int spaceId, String spaceName, String spaceImageUrl, BigDecimal totalprice) {
        this.spaceId = spaceId;
        this.spaceName = spaceName;
        this.spaceImageUrl = spaceImageUrl;
        this.totalprice = totalprice;
    }




    public int getSpaceId() {
        return spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public String getSpaceImageUrl() {
        return spaceImageUrl;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setAmenities(Amenities amenities) {
        this.amenities = amenities;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

//    public void setDimension(Dimension dimension) {
//        this.dimension = dimension;
//    }



    public Location getLocation() {
        return location;
    }

    public Address getAddress() {
        return address;
    }

    public Category getCategory() {
        return category;
    }

//    public Dimension getDimension() {
//        return dimension;
//    }

    public Amenities getAmenities() {
        return amenities;
    }

}
