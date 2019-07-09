package com.stackroute.workspaceService.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
import java.util.Arrays;


@Document
@Data
public class Category1 {

    @Id
    int categoryId;
    String categoryName;
    BigDecimal price;
    String[] additionalAmenities;
    private MySpace mySpace;
    private Address address;
    private Dimension dimension;
    private Location location;


    public Category1() {
    }

    public Category1(int categoryId, String categoryName, BigDecimal price, String[] additionalAmenities, MySpace mySpace, Address address, Dimension dimension, Location location) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.price = price;
        this.additionalAmenities = additionalAmenities;
        this.mySpace = mySpace;
        this.address = address;
        this.dimension = dimension;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", additionalAmenities=" + Arrays.toString(additionalAmenities) +
                ", space=" + mySpace +
                ", address=" + address +
                ", dimension=" + dimension +
                ", location=" + location +
                '}';
    }

}

