package com.stackroute.userservice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

//import org.springframework.context.annotation.Bean;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private String name;

    private int contactNumber;

    private String emailId;

    private int uid;



    @Transient
    private String password;

    private String address;

}
