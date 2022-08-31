package com.garage;

import java.util.Scanner;

public class ParkoutForm implements InputForm{
    @Override
    public void enterNeededInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Vehicle identification number: ");
        int ident = in.nextInt();
        System.out.print("Enter slot id: ");
        int id = in.nextInt();
        ParkoutControl k=new ParkoutControl();
        try
        {
            k.Park_out(ident,id);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
