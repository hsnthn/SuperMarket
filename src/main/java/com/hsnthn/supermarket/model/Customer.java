package com.hsnthn.supermarket.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
public class Customer {

    @Id
    private String customerId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private Date createdDate;
    private Date modifiedDate;
    private Boolean isActive;
}