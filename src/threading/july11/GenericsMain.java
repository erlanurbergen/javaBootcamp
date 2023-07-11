package threading.july11;

public class GenericsMain {
    public static void main(String[] args) {
//        Car<String, ElectroEngine> car = new Car(new ElectroEngine(), "Mazda");
//        System.out.println(car);

        Car2 car2 = new Car2();
        car2.sayHello();
        String res = new GenericsMain().<String>getRes();
        System.out.println(res);

    }

    private <T> String getRes() {

        return " ";
    }
}

class Book {

}

class ChupaChups {

}

class Car<T extends String, T2 extends Engine>{
    private T2 name;
    private T engine;

    public Car(T2 name, T engine) {
        this.name = name;
        this.engine = engine;

    }

    public T2 getName() {
        return name;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    public T getEngine() {
        return engine;
    }

    public void setEngine(T engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}


class Car2 {
    <T> void sayHello() {
        System.out.println("say hello");
    }
}
class Engine {

}

class OilEngine extends Engine{
    void ride() {
        System.out.println("engine done work");
    }
}

class ElectroEngine extends Engine{
    void electroCompleted() {
        System.out.println("completed");
    }


}

class HybridEngine extends Engine{
    void done() {
        System.out.println("done");
    }
}
