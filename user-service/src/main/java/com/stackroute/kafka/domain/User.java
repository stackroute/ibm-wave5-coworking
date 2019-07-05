package com.stackroute.kafka.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
@Data
public class User {

    @Id
    private long uid;

    private String name;

    private long contactNumber;

    private String emailId;

    @Transient
    private String password;

    private String address;


    public User() {
        super();
    }

    public User(String name, int contactNumber,String emailId, int uid,String password,String address) {
        super();
        this. uid=  uid;
        this.name = name;
        this.contactNumber= contactNumber;
        this.emailId = emailId;
        this. password=  password;
        this. address= address;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", contactNumber=" + contactNumber +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
