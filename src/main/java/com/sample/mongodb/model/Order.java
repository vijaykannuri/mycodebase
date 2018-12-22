package com.sample.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;


@Document(collection="order")
public class Order {

    @Id
    private String id;

    @Field("account_id")
    private String accountId;

    @Field("order_time")
    private Date orderTime;

    private ShipMents shipMents;

    private List<OrderItems> orderItems;

    private double totalInvoice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public ShipMents getShipMents() {
        return shipMents;
    }

    public void setShipMents(ShipMents shipMents) {
        this.shipMents = shipMents;
    }

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(double totalInvoice) {
        this.totalInvoice = totalInvoice;
    }
}
