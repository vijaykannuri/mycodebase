package com.sample.mongodb.service;

import com.sample.mongodb.model.Order;
import com.sample.mongodb.model.Request.OrderRequest;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    String saveOrder(OrderRequest order);
}
