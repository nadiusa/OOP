package com.company;

public class A {
   protected String a;
   protected X x= new X("Vasea");

    public A(String a) {
        this.a = a;
        //this.x=x;
    }

    @Override
    public String toString() {
        return "A{" + "a='" + a + '\'' + ", x=" + x + '}';
    }
}
