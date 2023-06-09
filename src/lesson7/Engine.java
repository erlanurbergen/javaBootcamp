package lesson7;

public class Engine {
    String name;
    double volume;

    public Engine(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
