package lesson9;

import javax.swing.event.DocumentEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // наследование и полиморфизм
        Device device = new Device("Device1");
        Laptop laptop = new Laptop("Lenovo", "Intel core i9", 14);
        Phone phone = new Phone("Iphone 14", "China", 600000);

//        Device devices[] = {device, laptop, phone};
//        for (Device device1 : devices) {
//            if (device1 instanceof Laptop)
//                device1.switchOn(true);
//            System.out.println("--------");
//        }

//        printDevice(laptop);

        Device d = new Device();
        Device l = new Laptop();
//      Laptop l1 = (Laptop) new Device();
//        d.switchOn(true);
//        l.switchOn(false);
//

//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.txt"));
//        objectOutputStream.writeObject(new Device("Device"));
//        objectOutputStream.close();

//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data.txt"));
//        Device d = (Device)inputStream.readObject();
//        System.out.println(d);

//        List<String> names = new ArrayList<>();


    }

    private static void printDevice(Device d) {
        d.switchOn(true);
    }

    // Iphone 3
    // Iphone 14
}


// parent class - родительский класс
class Device implements Serializable {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public Device() {
    }

    //    public Device(String name) {
//        this.name = name;
//    }

    void switchOn(boolean b) {
        if (b)
            System.out.println("Device is working");
        else
            System.out.println("Device doesnt work");
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Phone extends Device {
    private String madeCountry;
    private int cost;

    public Phone(String madeCountry, int cost) {
        this.madeCountry = madeCountry;
        this.cost = cost;
    }

    public Phone(String name, String madeCountry, int cost) {
        super(name);
        this.madeCountry = madeCountry;
        this.cost = cost;
    }

    @Override
    void switchOn(boolean b) {
        System.out.println("Метод сработает по иному");
        System.out.println(madeCountry + " " + cost);
    }
}

class Laptop extends Device {
    private String proseccor;
    private double monitorSize;

    public Laptop(String name, String proseccor, double monitorSize) {
        super(name);
        this.proseccor = proseccor;
        this.monitorSize = monitorSize;
    }

    public Laptop(String proseccor, double monitorSize) {
        this.proseccor = proseccor;
        this.monitorSize = monitorSize;
    }

    public Laptop() {
    }

    @Override
    void switchOn(boolean b) {
        System.out.println("Сейчас мы в Laptop class");
        System.out.println(proseccor + " " + monitorSize);
    }

    void checkMethod() {
        System.out.println("any any");
    }
}
