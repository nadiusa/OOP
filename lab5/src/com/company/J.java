package com.company;

public class J extends I{
   protected String j;
    private X x= new X("Alice");

    public J(String i, String j) {
        super(i);
        this.j = j;
    }



    @Override
    public String toString() {
        return "J{" + "j='" + j + '\'' + ", i='" + i + '\'' + ", h='" + h + '\'' + ", g='" + g + '\'' + ", f='" + f + '\'' + ", e='" + e + '\'' + ", d='" + d + '\'' + ", c='" + c + '\'' + ", b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}
