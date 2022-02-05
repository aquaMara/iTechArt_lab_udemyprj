package com.aquam.unit_8.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Contact c = new Contact("M", "234");
        Contact c2 = new Contact("M", "156");

        MobilePhone mp = new MobilePhone("Name");
        mp.addNewContact(c2);
        mp.addNewContact(c);
        mp.printContacts();
    }
}
