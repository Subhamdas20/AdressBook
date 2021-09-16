package com.bz.addressbook;

import java.util.Scanner;

public class AddressBook {

    String firstName,lastName,address,city,state,emailId;
    int zip,phoneNumber;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first name");
        String firstName=sc.nextLine();
        setFirstName(firstName);
        System.out.println("Last name");
        String lastName = sc.nextLine();
        setLastName(lastName);
        System.out.println("Enter address");
        String address = sc.nextLine();
        setAddress(address);
        System.out.println("Enter city ");
        String city = sc.nextLine();
        setCity(city);
        System.out.println("Enter state ");
        String state = sc.nextLine();
        setState(state);
        System.out.println("Enter EmailId ");
        String emailId = sc.nextLine();
        setEmailId(emailId);
        System.out.println("Enter zip ");
        int zip  = sc.nextInt();
        setZip(zip);
        System.out.println("Enter phone number ");
        int phoneNumber = sc.nextInt();
        setPhoneNumber(phoneNumber);

    }

    }
