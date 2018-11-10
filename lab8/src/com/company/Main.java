package com.company;

public class Main {

    public static void main(String[] args) {

        Cub cub=new Cub(4);
        Sphere sphere=new Sphere(6);
        Parallelipiped parallelipiped= new Parallelipiped(5,6,10);
        GeometricBody[] geometricBody={cub, sphere, parallelipiped};
        System.out.println(GeometricBodyController.getBiggestVolumedBody(geometricBody));
        System.out.println(GeometricBodyController.getBiggestAreaBody(geometricBody));
        cub.print();
        sphere.print();
        parallelipiped.print();
    }
    }
