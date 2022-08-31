package com.garage;

public class totalVehicle {
    int totalVehicle;
    //Singleton
    private static totalVehicle total;
    private totalVehicle()
    {
        totalVehicle = 0;
    }
    public static totalVehicle getInstance()
    {
        if (total == null)
            total = new totalVehicle();
        return total;
    }
    //add new vehicle
    public void add()
    {
        totalVehicle++;
    }
    //remove vehicle
    public void remove()
    {
        totalVehicle--;
    }
    //getter
    public int getTotalVehicle() {
        return totalVehicle;
    }
}
