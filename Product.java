package com.company;

import java.util.ArrayList;

public class Product {

    private String name;
    private double price;
    private int code;
    private int numberOfProducts;

    public Product (String name,double price, int code, int numberOfProducts) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.numberOfProducts = numberOfProducts;
        if (numberOfProducts < 0) {
            System.out.println("Amount cannot be smaller than 0");
        }
        else {
            this.numberOfProducts = numberOfProducts;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
