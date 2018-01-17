package com.hsnthn.supermarket.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
public class Discount {

    @Id
    private String discountId;
    private String type;
    private String name;
    private Boolean isGlobal;
    private int allowedUses;
    private int usedCount;
    private Double quantityInStock;
    private Date startDate;
    private Date endDate;
    private String description;
    private Date createdDate;
    private Date modifiedDate;
    private Boolean isActive;
}