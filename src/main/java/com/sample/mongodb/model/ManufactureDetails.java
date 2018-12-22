package com.sample.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class ManufactureDetails {

    @Field("model_number")
    private String modelNumber;

    @Field("release_date")
    private String releaseDate;


    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
