package com.garage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputForm inp;
        //start set-up program
        System.out.print("How many slots in your garage? ");
        int size = in.nextInt();
        for (int i=0 ; i<size ; i++) {
            inp = new SlotForm();
            inp.enterNeededInfo();
        }
        inp = new ConfigForm();
        inp.enterNeededInfo();
        //end set-up program

        //start using program
        while (true)
        {
            System.out.println("------------------------------------");
            System.out.println("Welcome! how are you?");
            System.out.println("1. Garage Owner");
            System.out.println("2. Vehicle Owner");
            System.out.println("3. Exit");
            int choose = in.nextInt();
            if (choose == 1)
            {
                System.out.println("What do you want ?");
                System.out.println("1.Add new slot");
                System.out.println("2.Get garage information");
                choose = in.nextInt();
                if(choose == 1)
                {
                    inp = new SlotForm();
                    inp.enterNeededInfo();
                }
                else if(choose == 2)
                {
                    inp = new GarageInformationForm();
                    inp.enterNeededInfo();
                }
                else{
                    System.out.println("please try again and choose correct number!");
                }
            }
            else if (choose == 2)
            {
                System.out.println("What do you want?");
                System.out.println("1. park-in");
                System.out.println("2. park-out");
                choose = in.nextInt();
                if (choose == 1)
                {
                    inp = new ParkInForm();
                    inp.enterNeededInfo();
                }
                else if(choose==2){
                    inp=new ParkoutForm();
                    inp.enterNeededInfo();
                }
                else
                {
                    System.out.println("please try again and choose correct number!");
                }
            }
            else if (choose == 3)
            {
                System.out.println("Thank you...");
                break;
            }
            else {
                System.out.println("please try again and choose correct number!");
            }
        }
    }
}
