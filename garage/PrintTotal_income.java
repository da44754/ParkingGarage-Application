package com.garage;

public class PrintTotal_income implements GaragePrinter {
    CalculateFees s;
    public PrintTotal_income()
    {
        s = new CalculateFees_by_Hours();
    }
    public void print()
    {
        System.out.println("Total income: "+s.getSum()+"$");
    }
}
