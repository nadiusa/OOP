package com.company;

public class Address{
    String address;
    Address(String streetName, int streetNumber) {
       String streetNumber1 = String.valueOf(streetNumber);
       address = streetName +"" + streetNumber1;
    }
    String getAddress(){
        return address;
    }

}
