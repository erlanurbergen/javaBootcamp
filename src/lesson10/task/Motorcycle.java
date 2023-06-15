package lesson10.task;

public class Motorcycle extends Vehicle implements Drivable{
    private double power; // 100 km = 9l
    private double price;

    public Motorcycle(String make, String model, double power, double power1, double price) {
        super(make, model, power);
        this.power = power1;
        this.price = price;
    }

    @Override
    public void start(double distance) {
        switch ((int)getPower()) {
            case 2:
                double res = (distance * 9l) / 100;
                System.out.println(res);
                break;
        }
    }

    @Override
    public void stop() {

    }

    @Override
    double getPrice() {
        return price;
    }
}
