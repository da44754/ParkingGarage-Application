package com.garage;

import java.util.Scanner;

public class GarageInformationForm implements InputForm {

    @Override
    public void enterNeededInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Display all free slots");
        System.out.println("2.Get total number of vehicles");
        System.out.println("3.Get total income");
        System.out.print("Choose: ");
        Integer choose = in.nextInt();
        while (choose != 1 && choose!=2 && choose !=3)
        {
            System.out.println("choose correct number!");
            System.out.print("Choose: ");
            choose = in.nextInt();
        }
        GarageInformationControl g = GarageInformationControl.getInstance();
        g.printInfo(choose);
    }
}
