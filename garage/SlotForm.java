package com.garage;

import java.util.Scanner;

public class SlotForm implements InputForm {
    //ask for enter slot’s id, depth and width.
    public void enterNeededInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Slot Information: ");
        System.out.print("ID: ");
        int id = in.nextInt();
        System.out.print("Width: ");
        int width = in.nextInt();
        System.out.print("Depth: ");
        int depth = in.nextInt();
        while (id == 0 || width <1 || depth <1)
        {
            System.out.println("you cannot enter any dimension less than 1 and slot's id cannot be 0 !!");
            System.out.print("ID: ");
            id = in.nextInt();
            System.out.print("Width: ");
            width = in.nextInt();
            System.out.print("Depth: ");
            depth = in.nextInt();
        }
        try {
            SlotControl c =new SlotControl();
            c.setSlotInfo(id, width, depth);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
