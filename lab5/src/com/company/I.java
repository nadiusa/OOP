package com.company;

public class I extends H{
    String i;
    protected X x= new X("Mirela");
    public I( String i) {
        super("hhh");
        this.i = i;
    }

    public I(){
        super("hh");
    }

    @Override
    public String toString() {
        return "I{" + "i='" + i + '\'' + ", h='" + h + '\'' + ", g='" + g + '\'' + ", f='" + f + '\'' + ", e='" + e + '\'' + ", d='" + d + '\'' + ", c='" + c + '\'' + ", b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}
