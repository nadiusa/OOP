package com.company;

public class F extends E {
     protected String f;

    public F(String f) {
        super("eee");
        this.f = f;
    }

    @Override
    public String toString() {
        return "F{" + "f='" + f + '\'' + ", e='" + e + '\'' + ", d='" + d + '\'' + ", c='" + c + '\'' + ", b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}
