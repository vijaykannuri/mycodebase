package com.sample.mongodb.Controller;


import com.sample.mongodb.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sample.mongodb.model.Inventory;
import javax.validation.Valid;
import java.io.IOException;

@RequestMapping("/")
@RestController
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @ResponseBody
    @PostMapping(value = "/inventory")
    public String saveInventory(@Valid @RequestBody Inventory inventory){
        return inventoryService.saveInventory(inventory);
    }

}
