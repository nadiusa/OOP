package com.company;


public class FullName {
    String name;

    FullName (String gn, String mn, String fn) {
        name = gn + "" + mn +"" + fn;
    }

    String getName() {
        return name;
    }
}