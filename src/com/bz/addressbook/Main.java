package com.bz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<AddressBook> contacts = new ArrayList<>();
        AddressBook contact_One = new AddressBook();
        contact_One.setData();
        contacts.add(contact_One);

    }
}
