package com.company;

public class G extends F {
     protected String g;

    public G( String g) {
        super("fff");
        this.g = g;
    }

    @Override
    public String toString() {
        return "G{" + "g='" + g + '\'' + ", f='" + f + '\'' + ", e='" + e + '\'' + ", d='" + d + '\'' + ", c='" + c + '\'' + ", b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}
