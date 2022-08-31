package com.garage;

import java.util.List;

public class SlotFirstConfig implements ISlotConfiguration{
    @Override
    public SlotInformation check(List<SlotInformation> slots, Dimension v) {
        for (SlotInformation slot : slots)
        {
            if (slot.getDimension().getDepth() >= v.getDepth() && slot.getDimension().getWidth() >= v.getWidth()
                && slot.getAvailable())
                return slot;
        }
        return null;
    }
}
