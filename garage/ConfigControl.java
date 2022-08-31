package com.garage;

import java.util.HashMap;
import java.util.Map;

public class ConfigControl {
    Map choose;
    public ConfigControl()
    {
        choose = new HashMap<Integer, ISlotConfiguration>();
        choose.put(1, new SlotBestConfig());
        choose.put(2, new SlotFirstConfig());
    }
    //set configuration result
    public void checkConfig(Integer contin)
    {
        GarageParkingIn.getInstance().addConfig( (ISlotConfiguration)choose.get(contin) );
    }
}
