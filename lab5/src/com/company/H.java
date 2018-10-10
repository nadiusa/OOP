package com.company;

public class H extends G{
    protected String h;
    private X x= new X("Vitalina");
    public H( String h) {
        super("ggg");
        this.h = h;
    }

    @Override
    public String toString() {
        return "H{" + "h='" + h + '\'' + ", g='" + g + '\'' + ", f='" + f + '\'' + ", e='" + e + '\'' + ", d='" + d + '\'' + ", c='" + c + '\'' + ", b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}
