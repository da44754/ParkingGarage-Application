package com.garage;

import java.util.Scanner;
public class payment_by_credit_card implements Payment{

    public void payment(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Before parking-out you need to pay your fees!!");
        System.out.print("Enter credit card number: ");
        int num = in.nextInt();
        System.out.println("Successful payment! thank you...");
        System.out.println();
    }
}
