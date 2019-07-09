package com.stackroute.workspaceService.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Address {
    @Id
    int pincode;

    String buildingNumber;
    String area;
    String city;
    String state;
    String country;

    public Address() {
    }

    public Address(String buildingNumber, String area, String city, String state, String country, int pincode) {
        this.buildingNumber = buildingNumber;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "buildingNumber='" + buildingNumber + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}

