package com.sample.mongodb.service.Impl;

import com.sample.mongodb.model.Inventory;
import com.sample.mongodb.repository.InventoryRepository;
import com.sample.mongodb.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;



    //check the duplicate checks in database before inserting depending on unique fields.

    public String saveInventory(Inventory inventory){
        inventoryRepository.save(inventory);
        return "success";
    }

    public List<Inventory> getInventories(List<String> productIds){
     return inventoryRepository.findByIdIn(productIds);
    }


    public void saveInventories(List<Inventory> values){
        inventoryRepository.saveAll(values);
    }


}
