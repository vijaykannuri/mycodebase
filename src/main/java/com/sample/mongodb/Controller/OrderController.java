package com.sample.mongodb.Controller;

import com.sample.mongodb.model.Inventory;
import com.sample.mongodb.model.Order;
import com.sample.mongodb.model.Request.OrderRequest;
import com.sample.mongodb.service.InventoryService;
import com.sample.mongodb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @PostMapping(value = "/order")
    public String saveOrder(@Valid @RequestBody OrderRequest request){
        return orderService.saveOrder(request);
    }

}
