package com.company;

import java.util.ArrayList;

public class Basket {
    private User user;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Basket() {
    }

    public Basket(User user) {
        this.user = user; }

    public Basket(User user, ArrayList<Product> products)
    {
        this.user = user;
        this.products = products;
    }

    public void add(Product product)
    {
        int maxOfProducts = products.size();
        boolean notEnoughSpace = true;
        int numberOfProducts = product.getNumberOfProducts();

        if (numberOfProducts >= 1){
            products.add(product);
            product.setNumberOfProducts(numberOfProducts - 1);
        }else{
            notEnoughSpace = false;
        }
    }

    public void remove(Product product)
    {
        int maxOfProducts = products.size();
        boolean notEnoughSpace = true;
        int numberOfProducts = product.getNumberOfProducts();

        if (maxOfProducts >= 1){
            products.remove(product);
            product.setNumberOfProducts(numberOfProducts + 1);
        }else{
            notEnoughSpace = false;
        }
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public void buy()
    {
        double total = 0;
        for(int i = 0; i<products.size(); i++) {
            total += products.get(i).getPrice();
        }
    }
}