package com.company;

public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;
    public String info;

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.info = info;
    }

    public User(String email) {
        this.email = email;
        info = " This is a guest account.";
    }

    public void UserFromGuest(String name, String lastName, String password) {
        if (info == "This is a guest account") {
            this.name = name;
            this.lastName = lastName;
            this.password = password;
            info = "This is user account.";
        } else {
            System.out.println("This account is already in use.");
        }
    }
}
