package model;

public class Courier {
    public int id;
    public double[] location;
    public boolean available = true;

    public Courier(int id, double[] location) {
        this.id = id;
        this.location = location;
    }
}