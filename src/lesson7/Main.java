package lesson7;

public class Main {
    public static void main(String[] args) {
        // Классы и объекты
        // конструктор
        // this
        // агрегация (зависимость)
        Engine engine = new Engine("Engine 1", 2.0);
        Car car = new Car("camry", 220, 5000000, engine); // мы создали наш объект
        Car car2 = new Car("corolla", 220, 4000000, engine); // мы создали наш объект
//        car.model = "camry";
//        car.cost = 23000000;
//        car.speed = 280;
//        car.ride();
        CarShop carShop = new CarShop("Toyota");
        carShop.addCar(car);
        carShop.addCar(car2);
//        System.out.println(carShop.getTotalPrice());
        carShop.deleteCar(car);
        carShop.printAllCars();
        
        // если успеем покажу Builder pattern
        /*
        Создайте класс Student с параметрами:
        (***Знак “+” означает что модификатор доступа public, “-“ означает private, а “#” - protected) + int id;
        + String name;
        + String surname;
        + double gpa;
        + Student()
        + Student(int id, String name, String surname, double gpa)
        + String getStudentData() // Данный метод возвращает все данные студента.
        В классе Main, вы должны создать 5 объектов разных студентов с разными параметрами.
        Создайте массив из класса Student, заполните массив 5 объектами класса Student которые мы создали до этого, и используя цикл, выведите данные по каждому студенту.


        Используйте предыдущий класс Student.
        Создайте специальный метод topStudent(Student students[]), который в аргументы принимает массив из студентов. Метод должен вывести из списка данные самого лучшего студента, у которого высокий gpa.
        Создайте 10 объектов разных студентов с разными параметрами.
        Примените этот метод.

        Создайте мини программу, с меню панелью отображенным ниже.
        PRESS [1] TO ADD STUDENT PRESS
        [2] TO LIST STUDENT PRESS
        [0] TO EXIT
        При нажатии [1]: Insert name?
        Вводите имя с консоли
        Insert surname?
        Вводите фамилию с консоли
        Insert GPA?
        Вводите GPA с консоли

        После введения данных, программа должна добавить в список нашего студента. При нажатии [2]: Программа должна вывести список всех студентов.
        1) Ilyas Zhuanyshev 4.0
        2) Aknur Abubakirova 3.9
        3) Dauren Mukhametkarim 3.5
        4) Almat Ybyray 3.4
        5) Aziza Kamet 3.2
        При нажатии [0], программа должна выйти.
        */
    }
}
