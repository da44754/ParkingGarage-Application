package com.garage;

import java.util.List;

public class SlotBestConfig implements ISlotConfiguration{
    @Override
    public SlotInformation check(List<SlotInformation> slots, Dimension v) {
        SlotInformation mySlot = null;

        for (SlotInformation slot : slots)
        {
            if (slot.getDimension().getDepth() >= v.getDepth() && slot.getDimension().getWidth() >= v.getWidth()
                    && slot.getAvailable())
            {
                if (mySlot == null)
                    mySlot = slot;
                else
                {
                    if (mySlot.getDimension().getDepth() > slot.getDimension().getDepth() ||
                            mySlot.getDimension().getWidth() > slot.getDimension().getWidth())
                        mySlot = slot;
                }
            }
        }
        return mySlot;
    }
}
