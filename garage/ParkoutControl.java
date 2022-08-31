package com.garage;

public class ParkoutControl {
    public void Park_out(int ident,int id)
    {
        GarageParkingOut p = new GarageParkingOut();
        GarageParkingIn g = GarageParkingIn.getInstance();
        try {
            GarageParking found = p.park_out_(ident,id,g.getPark());
            if (found != null)
            {
                Ricept c = new Ricept();
                c.print_resipt(found);
                Payment pay = new payment_by_credit_card();
                pay.payment();
                g.deleteVehicle(found);
            }
        }
        catch (IllegalArgumentException ex)
        {
            throw ex;
        }

    }
}
