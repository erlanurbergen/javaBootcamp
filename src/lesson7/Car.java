package lesson7;

// мы создали класс
// Класс это шаблон описания объекта
public class Car {
    // аттрибуты состояние
    // методы поведение

     String model;
     int speed;
     double cost;

     // зависимость
     Engine engine;

     public Car(String model, int speed, double cost, Engine engine) {
          this.model = model;
          this.speed = speed;
          this.cost = cost;
          this.engine = engine;
     }

     public Car() {
     }

     @Override
     public String toString() {
          return "Car{" +
                  "model='" + model + '\'' +
                  ", speed=" + speed +
                  ", cost=" + cost +
                  "engine: " + engine +
                  '}';
     }

     // чтобы нам задать состояние нашему будущему объекту, мы создаем конструктор
     // конструктор - это метод, который сработает при инициализации нашего объекта

     // empty конструктор
//     public Car(){}

     // with parameters
//     public Car(String md, int speed, double cost) {
//          this.model = md;
//          this.speed = speed;
//          this.cost = cost;
//     }

//     public Car() {
//
//     }


     void ride() {
         System.out.println(model + " is riding");
     }

//     @Override
//     public String toString() {
//          return model + " " + speed + " " + cost;
//     }
}
