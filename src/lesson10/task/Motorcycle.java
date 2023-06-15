package lesson10.task;

public class Motorcycle extends Vehicle implements Drivable{
    private double power; // 100 km = 9l
    private double price;

    public Motorcycle(String make, String model, double power, double price) {
        super(make, model);
        this.power = power;
        this.price = price;
    }

    @Override
    public void start() {
        System.out.println(getModel() + " is starting");
    }

    @Override
    public void stop() {
        System.out.println(getModel() + " stop");

    }

    @Override
    double getPrice() {
        return price;
    }
}
