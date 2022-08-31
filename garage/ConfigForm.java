package com.garage;
import java.util.Scanner;

public class ConfigForm implements InputForm{
    //ask garage owner to set park-in configuration (best-fit or first fit)
    public void enterNeededInfo()
    {
        System.out.println("Select park-in configuration ");
        System.out.println("1. Best-fit");
        System.out.println("2. First-fit");
        System.out.print("Choose: ");
        Scanner in = new Scanner(System.in);
        Integer contin = in.nextInt();

        //handle any wrong choose
        while (contin!=1 && contin!=2)
        {
            System.out.print("Again! Choose: ");
            contin = in.nextInt();
        }
        ConfigControl c =new ConfigControl();
        c.checkConfig(contin);
    }
}
