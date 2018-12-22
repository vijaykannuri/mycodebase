package com.sample.mongodb.model.Request;

import com.sample.mongodb.model.Address;
import com.sample.mongodb.model.OrderItems;
import com.sample.mongodb.model.PaymentMethods;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class OrderRequest {

    @NotNull
    private String accountId;

    private Date orderTime;

    @NotNull
    private Address address;

    @NotNull
    private List<OrderItems> orderItems;
    private PaymentMethods paymentMethods;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }

    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(PaymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
