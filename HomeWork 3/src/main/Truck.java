package main;

public class Truck extends Vechicle{
    private double load_Capacity;
    private float towing_Capacity;

    public Truck(String m_name, int cylinder, String ownerName, double load_Capacity, float towing_Capacity) {
        super(m_name, cylinder, ownerName);
        this.load_Capacity = load_Capacity;
        this.towing_Capacity = towing_Capacity;
    }

    public Truck(double load_Capacity, float towing_Capacity) {
        this.load_Capacity = load_Capacity;
        this.towing_Capacity = towing_Capacity;
    }

    public double getLoad_Capacity() {
        return load_Capacity;
    }

    public void setLoad_Capacity(double load_Capacity) {
        this.load_Capacity = load_Capacity;
    }

    public float getTowing_Capacity() {
        return towing_Capacity;
    }

    public void setTowing_Capacity(float towing_Capacity) {
        this.towing_Capacity = towing_Capacity;
    }
}
