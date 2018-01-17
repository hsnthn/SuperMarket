package com.hsnthn.supermarket.service.order;

import com.hsnthn.supermarket.exception.OrderException;
import com.hsnthn.supermarket.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> findOrderByCustomerId(String customerId) throws OrderException;

}
