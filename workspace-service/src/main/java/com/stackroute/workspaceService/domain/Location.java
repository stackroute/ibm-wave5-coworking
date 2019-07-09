package com.stackroute.workspaceService.domain;



import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Location {
    @Id
    String locationName;
    double latitude;
    double longitude;
    private MySpace mySpace;
    private Address address;
    // private Category category;
    private Dimension dimension;


    public Location() {
    }


    public Location(String locationName, double latitude, double longitude, MySpace mySpace, Address address/*, Category category*/, Dimension dimension) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mySpace = mySpace;
        this.address = address;
        //this.category = category;
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationName='" + locationName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", space=" + mySpace +
                ", address=" + address +
                //", category=" + category +
                ", dimension=" + dimension +
                '}';
    }
}
