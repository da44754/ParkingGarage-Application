package com.garage;

import java.util.List;

public class GarageParkingOut {
    public GarageParking park_out_(int ident, int id, List<GarageParking> k)
    {
        boolean flag = true;
        GarageParking myVehicle = null;
        for (GarageParking i : k)
        {
            if ((int)i.getVehicle().getAllInfo("Unique Identification Number") == ident && i.getSlot().getId() == id)
            {
                myVehicle = i;
                flag = false;
                break;
            }
        }
        if (flag)
            throw new IllegalArgumentException("Please check entered information and try again!");

        myVehicle.set_end_date();
        return myVehicle;
    }
}
