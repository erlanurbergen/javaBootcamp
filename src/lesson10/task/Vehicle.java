package lesson10.task;

public abstract class Vehicle {
    private String make;
    private String model;
    private double power;

    public Vehicle(String make, String model, double power) {
        this.make = make;
        this.model = model;
        this.power = power;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    abstract double getPrice();
}
