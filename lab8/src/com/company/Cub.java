package com.company;

public class Cub implements GeometricBody,Printable {
    double side;

    public Cub(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side,3);
    }

    @Override
    public double getSurface() {
        return 6*Math.pow(side,2);
    }

    @Override
    public void print() {
        System.out.println(getSurface());
        System.out.println(getVolume());
    }
}
