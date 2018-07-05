package com.evangertis;

public class Star extends HeavenlyBody {
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.STAR);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyTypes() == BodyTypes.STAR){
            return super.addSatellite(moon);
        }
        else{
            return false;
        }
    }
}
