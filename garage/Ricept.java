package com.garage;

import java.time.format.DateTimeFormatter;

public class Ricept {
    void print_resipt(GarageParking k)
    {
        CalculateFees c=new CalculateFees_by_Hours();
        c.calculateFess(k);
        DateTimeFormatter dfor =  DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        System.out.println("");
        System.out.println("Dear our customer .... ");
        System.out.println("Your park_in time: "+dfor.format(k.getEntryDate()));
        System.out.println("Your park_out  time: "+dfor.format(k.getEndDate()));
        System.out.println("Total fees: "+c.getRes()+"$");
    }
}
