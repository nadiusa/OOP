package com.company;

public class D extends C {
    protected String d;
protected X x= new X("Aliona");
    public D(String d) {
        super("ccc");
        this.d = d;
    }

    @Override
    public String toString() {
        return "D{" + "d='" + d + '\'' + ", c='" + c + '\'' + ", b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}


