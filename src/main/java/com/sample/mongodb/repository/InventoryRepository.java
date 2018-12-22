package com.sample.mongodb.repository;

import com.sample.mongodb.model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InventoryRepository  extends MongoRepository<Inventory,String>,InventoryRepositoryCustom {

    List<Inventory> findByIdIn(List<String> ids);
}
