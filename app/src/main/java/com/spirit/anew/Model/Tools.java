package com.spirit.anew.Model;

import com.google.gson.annotations.SerializedName;

public class Tools {

    @SerializedName("id") private int id;
    @SerializedName("brand") private String brand;
    @SerializedName("model") private String model;
    @SerializedName("imageUrl") private String imageUrl;
    @SerializedName("type") private String type;
    @SerializedName("price") private double price;
    @SerializedName("quantity") private int quantity;

    public Tools(String brand, int id, double price, String imageUrl, String model, String type, int quantity) {
        this.brand = brand;
        this.id = id;
        this.price = price;
        this.imageUrl = imageUrl;
        this.model = model;
        this.type = type;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

