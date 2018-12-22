package com.sample.mongodb.repository;

import com.sample.mongodb.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {
}
