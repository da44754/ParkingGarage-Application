package com.garage;

import java.util.Map;

public class ParkInControl {
    //add new vehicle
    public void setVehicle(Map vehicleInfo)
    {
        try
        {
            GarageParkingIn g = GarageParkingIn.getInstance();
            int id = g.addVehicle(vehicleInfo);
            if (id != 0)
            {
                Ticket t = new Ticket();
                t.print(id);
            }
            else
            {
                throw new IllegalArgumentException("No available slots now, please wait!");
            }
        }
        catch (IllegalArgumentException ex)
        {
            throw ex;
        }
    }
}
