package com.company;

public class C extends B {
   protected String c;

    public C(String c) {
        super("bbb");
        this.c = c;
    }

    @Override
    public String toString() {
        return "C{" + "c='" + c + '\'' + ", b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}
