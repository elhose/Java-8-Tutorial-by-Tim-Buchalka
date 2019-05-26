package com.timbuchalka;

public class Planet extends  HeavenlyBody {
    public Planet(String name, double orbitalPeriod){
        super(name, orbitalPeriod, Type.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == Type.MOON){
            return super.addSatellite(moon);
        }else{
            return false;
        }
    }
}
