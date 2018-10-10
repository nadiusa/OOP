package com.company;

public class B extends A{
  protected String b;

    public B( String b) {
        super("aaa");
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" + "b='" + b + '\'' + ", a='" + a + '\'' + ", x=" + x + '}';
    }
}
