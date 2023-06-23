package dataStructures;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Asan", 22, 200000));
        personList.add(new Person("Gizat", 20, 220000));
        personList.add(new Person("renat", 21, 180000));
//        Collections.sort(personList, new SortBySalary());
//        System.out.println(personList);
        personList.stream().sorted(Comparator.comparing(Person::getSalary)).forEach(System.out::println);
    }
}

class Person{
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class SortBySalary implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSalary() > o2.getSalary())
            return 1;
        else if (o1.getSalary() < o2.getSalary())
            return -1;
        return 0;
    }
}
