package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("daddycool@o2.pl");
        User user2 = new User("strongman@wp.pl");
        User user3 = new User("Alex", "Potter", "alex@gmail.com", "alexiscool");
        User user4 = new User("David","Bowie","dave123@wp.pl","davelovesyou" );


        Product product1 = new Product("dress1", 50, 1754, 24);
        Product product2 = new Product("skirt3", 20, 3403,32 );
        Product product3 = new Product("tshirt 6", 17, 8537, 9);

        ArrayList<Product> products_list1 = new ArrayList<>(Arrays.asList(product1,product2));
        ArrayList<Product> products_list2 = new ArrayList<>(Arrays.asList(product3));

        Category category1 = new Category();
        Category category2 = new Category("Dresses");
        Category category3 = new Category("Skirts", products_list1);

        category1.addProduct(product1);
        category2.addProduct(product2);
        category3.addProduct(product3);

        Basket basket1=new Basket();
        Basket basket2= new Basket(user1);
        Basket basket3= new Basket(user2,products_list2);

        basket1.add(product1);
        basket2.add(product2);
        basket3.remove(product3);
        basket2.buy();
    }
}
