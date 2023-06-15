package lesson10.notAbstract;

public class Main {
    public static void main(String[] args) {

    }
}


class Car {
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

    void ride(boolean check){

    }

}

class OilCar extends Car {
    protected double engineVolume;

    public OilCar(String model, int speed, double engineVolume) {
        super(model, speed);
        this.engineVolume = engineVolume;
    }


}

class ElectroCar extends Car {
    private double distance;

    public ElectroCar(String model, int speed, double distance) {
        super(model, speed);
        this.distance = distance;
    }


}

