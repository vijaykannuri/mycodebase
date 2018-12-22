package com.sample.mongodb.service.Impl;

import com.sample.mongodb.model.Inventory;
import com.sample.mongodb.model.Order;
import com.sample.mongodb.model.OrderItems;
import com.sample.mongodb.model.Request.OrderRequest;
import com.sample.mongodb.model.ShipMents;
import com.sample.mongodb.repository.OrderRepository;
import com.sample.mongodb.service.InventoryService;
import com.sample.mongodb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Autowired
    private InventoryService inventoryService;

    @Override
    public String saveOrder(OrderRequest request) {



        //check account id exists in db or not.
         String accountId=request.getAccountId();

         //check if address id is of this requested user or not.
         //String addressId=request.getAddress();


        //check if inventory ids exist in db.
         List<OrderItems> orderItems=request.getOrderItems();

         List<String> products=request.getOrderItems().stream().map(OrderItems::getInventoryId).collect(Collectors.toList());


         List<Inventory> inventories=inventoryService.getInventories(products);


         Map<String,Inventory> map = new HashMap();

         for(Inventory inventory:inventories){
             map.put(inventory.getId(),inventory);
         }


         for(OrderItems items:orderItems) {
             String id = items.getInventoryId();
             if (items.getQuantity() > map.get(id).getAvailableNumber()) {
                 return "order can't be placed";
             }
         }

         if(updateInventories(map,request.getOrderItems())) {
            Order order = new Order();
            order.setAccountId(accountId);
            order.setOrderItems(orderItems);

            //calculate the invoice from inventories
            order.setTotalInvoice(23);

            order.setOrderTime(new Date());

            //shipment details
            ShipMents shipMents = new ShipMents();
            shipMents.setAddress(request.getAddress());
            shipMents.setTrackingNumber("");
            shipMents.setShipmentdDate(new Date());
            shipMents.setInvoiceNumber("1234");
            order.setShipMents(shipMents);

            orderRepository.save(order);

            return "success";
        }else{
             return "failed";
        }
    }


    public boolean updateInventories(Map<String,Inventory> inventoryHashMap,List<OrderItems> orderItems){

        for(OrderItems items:orderItems) {
            String id = items.getInventoryId();
            inventoryHashMap.get(id).setAvailableNumber(inventoryHashMap.get(id).getAvailableNumber()-items.getQuantity());
        }
        try {
            inventoryService.saveInventories(new ArrayList(inventoryHashMap.values()));
            return true;
        }catch(Exception ex){
            return false;
        }

    }
}
