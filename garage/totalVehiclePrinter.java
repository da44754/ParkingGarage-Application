package com.garage;

public class totalVehiclePrinter implements GaragePrinter {
    totalVehicle t;
    public totalVehiclePrinter() {
        t = totalVehicle.getInstance();
    }
    public void print()
    {
        System.out.println("Total Vehicles: " + t.getTotalVehicle());
    }
}
