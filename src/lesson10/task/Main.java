package lesson10.task;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Japan", "Honda", 2, 1993, 1500);
        Motorcycle m1 = new Motorcycle("Korea", "K1", 2, 250, 1200);
        car.start(60);
//        System.out.println(car.getPrice());
    }
}
