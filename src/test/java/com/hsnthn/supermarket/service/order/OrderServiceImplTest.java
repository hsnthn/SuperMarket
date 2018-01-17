package com.hsnthn.supermarket.service.order;

import com.hsnthn.supermarket.repository.OrderRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImplTest {

    @InjectMocks
    private OrderServiceImpl ordeorderService;

    @Mock
    private OrderRepository orderRepository;


}