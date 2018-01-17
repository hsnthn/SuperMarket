package com.hsnthn.supermarket.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
public class Order {

    @Id
    private String orderId;
    private String customerId;
    private String status;
    private Date orderDate;
    private Double totalAmount;
    private String discountId;

}