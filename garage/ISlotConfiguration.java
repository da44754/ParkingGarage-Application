package com.garage;

import java.util.List;

public interface ISlotConfiguration {
    public SlotInformation check(List<SlotInformation> slots, Dimension v);
}
