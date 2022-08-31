package com.garage;

import java.time.LocalDateTime;
import java.util.Date;

public class GarageParking {
    private SlotInformation slot;
    private Vehicle vehicle;
    public LocalDateTime entryDate;
    public LocalDateTime EndDate;
    public GarageParking(SlotInformation s, Vehicle v)
    {
        slot = s;
        vehicle = v;
        entryDate =LocalDateTime.now();
    }
    public void set_end_date(){
        EndDate=LocalDateTime.now();
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public SlotInformation getSlot() {
        return slot;
    }
    public LocalDateTime getEntryDate() { return entryDate;}
    public LocalDateTime getEndDate(){return EndDate;}
}
