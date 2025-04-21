package model;

public class Order {
    public int id;
    public double[] pickup;
    public double[] dropoff;
    public int prepTime;
    public int slaTime;

    public Order(int id, double[] pickup, double[] dropoff, int prepTime, int slaTime) {
        this.id = id;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.prepTime = prepTime;
        this.slaTime = slaTime;
    }
}