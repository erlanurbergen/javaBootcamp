package lesson10;

public class Main {
    // interfaces and abstract classes

    public static void main(String[] args) {
        OilCar oilCar = new OilCar("Toyota", 280, 3);
        ElectroCar electroCar = new ElectroCar("zeekr", 300, 99);
        oilCar.ride(true);
        electroCar.ride(true);



    }
}

abstract class Car {
    // могут поля
    // могут быть обычные методы
    // могут абстрактные методы

    // объекты абстрактного класса не могут быть созданы

    protected String model;
    protected int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void printData() {
        System.out.println(model + " " + speed);
    }

    abstract void ride(boolean check);

}

class OilCar extends Car {
    protected double engineVolume;

    public OilCar(String model, int speed, double engineVolume) {
        super(model, speed);
        this.engineVolume = engineVolume;
    }

    @Override
    void ride(boolean check) {
        if (check)
            System.out.println(model + " is riding");
        else
            System.out.println("crashing");
    }
}

class ElectroCar extends Car {
    private double distance;

    public ElectroCar(String model, int speed, double distance) {
        super(model, speed);
        this.distance = distance;
    }

    @Override
    void ride(boolean check) {
        if (check && distance >= 100)
            System.out.println(model + " is riding");
        else
            System.out.println("crashing");
    }
}
