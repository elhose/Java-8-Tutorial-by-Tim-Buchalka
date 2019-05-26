package com.timbuchalka;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Type bodyType;
    public enum  Type{
        PLANET,
        MOON,
        DWARFPLANET
    }

    public HeavenlyBody(String name, double orbitalPeriod, Type type) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = type;
        this.satellites = new HashSet<>();
    }

    public Type getBodyType() {
        return bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody){
            HeavenlyBody theObject =  (HeavenlyBody) obj;
            if (theObject.getName().equals(this.getName())){
                return theObject.getBodyType() == this.getBodyType();
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return  "name = " + this.name + '\'' +
                ", orbitalPeriod = " + this.orbitalPeriod +
                ", bodyType = " + bodyType;
    }
}
