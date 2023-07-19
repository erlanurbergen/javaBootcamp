package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        // Напишите программу, которая считывает список чисел с клавиатуры и использует Stream API для выполнения следующих операций:
        //* Фильтрация: Исключить из списка все числа, которые меньше 10.
        //* Преобразование: Умножить каждое число в списке на 2.
        //* Сортировка: Отсортировать полученный список чисел в порядке возрастания.
        //* Ограничение: Получить первые 5 чисел из отсортированного списка.
        //* Суммирование: Найти сумму всех чисел в полученном списке.

        // Напишите программу, которая работает с коллекцией объектов типа "Студент".
        // У каждого студента есть следующие атрибуты: имя (String), возраст (int) и средний балл (double). Используя Stream API, выполните следующие действия:
        //* Создайте список студентов и заполните его несколькими объектами "Студент".
        //* Отфильтруйте студентов, оставив только тех, у кого средний балл выше 80.
        //* Отсортируйте отфильтрованных студентов по возрасту в порядке убывания.
        //* Вычислите средний возраст отфильтрованных студентов.
        //* Найдите студента с самым высоким средним баллом.
        //* Сгруппируйте студентов по их возрасту и выведите
        // для каждой группы список студентов с их именами.
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alisher", 3.3));
        students.add(new Student("Bekzat", 3.2));
        students.add(new Student("Assan", 3.4));
        students.add(new Student("Erlan", 3.4));
        students.add(new Student("Arman", 3.2));
//        Student student = students.stream().max(Comparator.comparing(Student::getGpa)).get();
        Map<Double, List<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getGpa));
        collect.forEach((aDouble, students1) -> {
            System.out.println(aDouble);

            students1.forEach(System.out::println);
        });
//        System.out.println(student);


    }
}

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
