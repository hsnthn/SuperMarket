package com.hsnthn.supermarket.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
public class OrderLine {

    @Id
    private String id;
    private int quantity;
    private String productId;
    private String orderId;
    private Double taxAmount;
    private Double totalLineAmount;

}