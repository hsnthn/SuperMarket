package com.hsnthn.supermarket.service.order;

import com.hsnthn.supermarket.exception.OrderException;
import com.hsnthn.supermarket.model.Customer;
import com.hsnthn.supermarket.model.Order;
import com.hsnthn.supermarket.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public List<Order> findOrderByCustomerId(String customerId) throws OrderException {
        return null;
    }

}