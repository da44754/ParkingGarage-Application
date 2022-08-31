package com.garage;

public class SlotInformation {
    private int id;
    private Dimension dimension;
    private boolean available;

    //getters
    public Dimension getDimension() { return dimension; }
    public int getId() { return id; }
    public boolean getAvailable() { return available; }

    //add new slot to garage
    public SlotInformation(int id, int wid,int dep)
    {
        this.id = id;
        dimension = new Dimension(wid, dep);
        available = true;
    }
    //end addition

    //park-in
    //change available slot
    public void changeAvailable()
    {
        available = !(available);
    }
}
