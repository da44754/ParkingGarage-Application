package com.garage;

import java.util.HashMap;
import java.util.Map;

public class GarageInformationControl {
    Map choose;
    private static GarageInformationControl garage;
    private GarageInformationControl()
    {
        choose = new HashMap<Integer, GaragePrinter>();
        choose.put(1, new slotPrinter());
        choose.put(2, new totalVehiclePrinter());
        choose.put(3, new PrintTotal_income());
    }
    public static GarageInformationControl getInstance()
    {
        if (garage == null)
            garage = new GarageInformationControl();
        return garage;
    }
    public void printInfo(Integer x)
    {
        GaragePrinter g = (GaragePrinter)choose.get(x);
        g.print();
    }
}
