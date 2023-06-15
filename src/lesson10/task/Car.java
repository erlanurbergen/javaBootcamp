package lesson10.task;

public class Car extends Vehicle implements Drivable{
    private int year;
    private double price;

    public Car(String make, String model, double power, int year, double price) {
        super(make, model, power);
        this.year = year;
        this.price = price;
    }

    @Override
    public void start(double distance) {
        // 100 2power = 9l
        // 100 3power = 14l
        // 100 4power = 20l
        // 100 5power = 25l
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
