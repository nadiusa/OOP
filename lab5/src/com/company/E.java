package com.company;

public class E extends D {
   protected String e;

    public E( String e) {
        super("ddd");
        this.e = e;
    }

    @Override
    public String toString() {
        return "E{" + "e='" + e + '\'' + ", d='" + d + '\'' + ", c='" + c + '\'' + ", b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}
