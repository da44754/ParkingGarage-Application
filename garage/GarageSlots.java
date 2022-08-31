package com.garage;

import java.util.LinkedList;
import java.util.List;

public class GarageSlots {
    private List<SlotInformation> slots;
    //singleton
    private static GarageSlots garage;
    private GarageSlots()
    {
        slots = new LinkedList<SlotInformation>();
    }
    public static GarageSlots getInstance()
    {
        if (garage == null)
            garage = new GarageSlots();
        return garage;
    }
    //getters
    public List<SlotInformation> getSlots() {
        return slots;
    }

    //add new slot to my garage
    public void AddSlot(int id, int wid,int dep)
    {
        for (SlotInformation s : slots)
        {
            if (s.getId() == id)
                throw new IllegalArgumentException("ERROR: Invalid Slot ID!");
        }
        slots.add( new SlotInformation(id, wid, dep) );
    }
}
