package com.company;

public class Parallelipiped implements GeometricBody,Printable {
    double length;
    double width;
    double height;

    public Parallelipiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length*width*height;
    }

    @Override
    public double getSurface() {
        return 2*(length*height  +  width*height  +  length*width);
    }

    @Override
    public void print() {
        System.out.println(getSurface());
        System.out.println(getVolume());
    }
}
