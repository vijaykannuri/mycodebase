package com.sample.mongodb.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class ShipMents {

    @Id
    private String id;

    private String invoiceNumber;

    private String trackingNumber;

    private Date  shipmentdDate;

    private Address address;

    private float shipmentCharges;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getShipmentdDate() {
        return shipmentdDate;
    }

    public void setShipmentdDate(Date shipmentdDate) {
        this.shipmentdDate = shipmentdDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public float getShipmentCharges() {
        return shipmentCharges;
    }

    public void setShipmentCharges(float shipmentCharges) {
        this.shipmentCharges = shipmentCharges;
    }
}
