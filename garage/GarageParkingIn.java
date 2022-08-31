package com.garage;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GarageParkingIn{
    private ISlotConfiguration config;
    private List<GarageParking> park;

    //Singleton
    private static GarageParkingIn garageParkingIn;
    private GarageParkingIn()
    {
        park = new LinkedList<GarageParking>();
    }
    public static GarageParkingIn getInstance()
    {
        if (garageParkingIn == null)
            garageParkingIn = new GarageParkingIn();
        return garageParkingIn;
    }

    public ISlotConfiguration getConfig() {
        return config;
    }
    public List<GarageParking> getPark() {
        return park;
    }

    //add configuration result that the rest of program will follow
    public void addConfig(ISlotConfiguration config)
    {
        this.config = config;
    }

    //park-in
    //add new vehicle in my garage
    public int addVehicle(Map vehicleInfo)
    {
        for (GarageParking i : park)
        {
            if ((int)vehicleInfo.get("Unique Identification Number") ==
                    (int)i.getVehicle().getAllInfo("Unique Identification Number"))
                throw new IllegalArgumentException("Please check Unique Identification Number of your car and try again!");
        }
        int id = 0;
        SlotInformation freeSlot = config.check(GarageSlots.getInstance().getSlots(), (Dimension)vehicleInfo.get("Dimension"));
        if (freeSlot != null)
        {
            freeSlot.changeAvailable();
            park.add(new GarageParking(freeSlot, new Vehicle(vehicleInfo) ));
            totalVehicle t = totalVehicle.getInstance();
            t.add();
            id = freeSlot.getId();
        }
        return id;
    }
    public void deleteVehicle(GarageParking g)
    {
        g.getSlot().changeAvailable();
        park.remove(g);
    }
}
