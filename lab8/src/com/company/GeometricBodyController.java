package com.company;

public class GeometricBodyController {

     static GeometricBody getBiggestVolumedBody(GeometricBody geometricBodies[]){
        GeometricBody biggestVolumedBody= geometricBodies[0];
        for (GeometricBody body: geometricBodies){
            if (body.getVolume()> biggestVolumedBody.getVolume()){
                biggestVolumedBody=body;
            }
        }
        return biggestVolumedBody;
    }
    static GeometricBody getBiggestAreaBody(GeometricBody geometricBodies[]){
         GeometricBody biggestAreaBody= geometricBodies[0];
         for (GeometricBody body: geometricBodies){
             if (body.getSurface()> biggestAreaBody.getSurface())
                 biggestAreaBody=body;
         }
         return biggestAreaBody;
    }
}
