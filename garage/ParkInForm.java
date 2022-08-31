package com.garage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkInForm implements InputForm{
    //enter vehicle’s information.
    @Override
    public void enterNeededInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Vehicle Information: ");
        System.out.print("Width: ");
        int width = in.nextInt();
        System.out.print("Depth: ");
        int depth = in.nextInt();
        System.out.print("Unique Identification Number: ");
        int id = in.nextInt();
        System.out.print("Model Name: ");
        String name = in.next();
        System.out.print("Model Year: ");
        String year = in.next();

        Map vehicleInfo = new HashMap<>();
        vehicleInfo.put("Dimension", new Dimension(width,depth));
        vehicleInfo.put("Unique Identification Number", id);
        vehicleInfo.put("Model Name", name);
        vehicleInfo.put("Model Year", year);

        try
        {
            ParkInControl c = new ParkInControl();
            c.setVehicle(vehicleInfo);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
