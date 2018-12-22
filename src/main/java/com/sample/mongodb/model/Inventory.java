package com.sample.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Document(collection="inventory")
public class Inventory {

    @Id
    private String id;

    @NotNull
    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("manufacture_details")
    private ManufactureDetails manufactureDetails;

    @NotNull
    @Field("shipping_details")
    private ShippingDetails shippingDetails;

    @NotNull
    @Field("pricing")
    private Pricing price;

    @Field("created_by")
    private String createdBy;

    @Field("modified_by")
    private String modifiedBy;

    @Field("created_date")
    private Date createdDate;

    @Field("modified_date")
    private Date modifiedDate;

    @Field("status")
    private Boolean status;


    @Field("available_number")
    private int availableNumber;


    @Field("product_type_id")
    private String productTypeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ManufactureDetails getManufactureDetails() {
        return manufactureDetails;
    }

    public void setManufactureDetails(ManufactureDetails manufactureDetails) {
        this.manufactureDetails = manufactureDetails;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public Pricing getPrice() {
        return price;
    }

    public void setPrice(Pricing price) {
        this.price = price;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public int getAvailableNumber() {
        return availableNumber;
    }

    public void setAvailableNumber(int availableNumber) {
        this.availableNumber = availableNumber;
    }
}
