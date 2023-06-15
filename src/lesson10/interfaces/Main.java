package lesson10.interfaces;

public class Main {
    public static void main(String[] args) {

    }

    private static void anything(Fly s) {

    }
}

interface Fly {
   void fly();

}

interface Swim {
    void swim();
}

class Fish implements Fly {

    @Override
    public void fly() {

    }
}

class Duck implements Fly, Swim {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}