package lesson10.task;

public class Car extends Vehicle implements Drivable{
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        super(make, model);
        this.year = year;
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
