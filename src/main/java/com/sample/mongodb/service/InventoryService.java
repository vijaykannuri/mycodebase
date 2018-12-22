package com.sample.mongodb.service;

import com.sample.mongodb.model.Inventory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface InventoryService {
    String saveInventory(Inventory inventory);

    List<Inventory> getInventories(List<String> productIds);

    void saveInventories(List<Inventory> values);
}
