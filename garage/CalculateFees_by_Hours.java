package com.garage;

import java.time.Duration;

public class CalculateFees_by_Hours implements CalculateFees {
    public static long sum;
    public long  res;
    public void calculateFess(GarageParking j)
    {
        Duration L=  Duration.between(j.getEntryDate(),j.getEndDate());
        long S= L.toSeconds();
        long y=S/(60*60);
        long p=(S%(60*60))/60;
        long c=(S%(60*60))%60;
        if(c==0&&p==0){
            res=(y*5);
        }
        else{
            res= (y * 5)+5;
        }
        sum+=res;
    }
    public long getSum(){
        return sum;
    }
    public long getRes(){return res;}

}
