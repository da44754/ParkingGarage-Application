package com.garage;

import java.util.List;

public class slotPrinter implements GaragePrinter
{
    GarageSlots slots;
    public slotPrinter()
    {
        slots = GarageSlots.getInstance();
    }
    public void print()
    {
        for (SlotInformation s : slots.getSlots())
        {
            if (s.getAvailable())
            {
                System.out.println("Slot ID: " + s.getId());
                System.out.print("slot  Dimension:  -width: " + s.getDimension().getWidth());
                System.out.println("   -depth: " + s.getDimension().getDepth());
                System.out.println();
            }
        }
    }
}
