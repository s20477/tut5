package com.company;

import java.util.*;
public class Category {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public Category () {
        this.name = "category";
    }

    public Category (String name){
        this.name = name;
    }

    public Category (String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void addProduct (Product addedProduct) {
        products.add(addedProduct);
    }
    public void removeProduct (Product removedProduct){
        products.remove(removedProduct);
    }

    public void setName(String name) {
        this.name = name;
    }
}