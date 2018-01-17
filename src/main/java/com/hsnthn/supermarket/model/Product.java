package com.hsnthn.supermarket.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
public class Product {

    @Id
    private String productId;
    private String type;
    private String name;
    private Double unitPrice;
    private String discountId;
    private Double quantityInStock;
    private Date createdDate;
    private Date modifiedDate;
    private Boolean isActive;
}