package com.garage;

public class SlotControl {
    public void setSlotInfo(int id, int wid,int dep) throws IllegalArgumentException
    {
        //send information to garage class
        GarageSlots s = GarageSlots.getInstance();
        s.AddSlot(id,wid,dep);
    }
}
