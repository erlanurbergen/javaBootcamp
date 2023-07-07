package dataStructures.mapAndSet;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // TreeMap - что это
        // отсортированные ключи
        // методы
        // put
        // remove
        // tailMap нахождение range
        // headMap
        // lastEntry нахождение последнего элемента
        // firstEntry нахождение последнего элемента
        // показать пример со сложным ключом
        // балансированное дерево

//        TreeMap<Integer, String> cities = new TreeMap<>();
//        cities.put(10000, "Almaty");
//        cities.put(12000, "Astana");
//        cities.put(15000, "Aktau");
//        cities.put(17000, "Aktobe");
//        cities.put(20000, "Taraz");
//        System.out.println(cities);
//        cities.remove(15000);
//        System.out.println(cities);
//        System.out.println(cities.tailMap(15000));
//        System.out.println(cities.headMap(15000));
//        System.out.println(cities.lastEntry());
//        System.out.println(cities.firstEntry());
//        System.out.println(cities.descendingMap());

        TreeMap<Person, Double> employees = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Person p = new Person("Gizat");
        Person p1 = new Person("Alikhan");
        Person p2 = new Person("Assan");
        employees.put(p, 550000.0);
        employees.put(p1, 650000.0);
        employees.put(p2, 570000.0);
        System.out.println(employees);

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
