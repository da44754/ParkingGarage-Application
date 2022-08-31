package com.garage;

import java.util.Date;
import java.util.Map;

public class Vehicle {
    private Map allInfo;

    //add new vehicle to the garage
    public Vehicle(Map info)
    {
        allInfo = info;
    }

    public Map getAllInfo() {
        return allInfo;
    }

    public Object getAllInfo(String key) {
        return allInfo.get(key);
    }
}
