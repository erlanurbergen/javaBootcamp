package dataStructures.mapAndSet;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        // Что такое Map
        // уникальность ключей
        // методы Map
        // put
        // putIfAbsent
        // get
        // remove
        // containsValue
        // containsKey
        // keySet
        // values

//        Map<String, Integer> data = new HashMap<>();
//        data.put("Elena", 18);
//        data.put("Antony", 18);
//        data.putIfAbsent("Elena", 77);
//        data.put(null, 17);
////        System.out.println(data.get("Antony2"));
////        data.remove("Elena");
////        System.out.println(data);
////        System.out.println(data.containsValue(18));
//        System.out.println(data.containsKey("Antony"));
//        System.out.println(data.keySet());
//        System.out.println(data.values());

//        Map<Person, String> data = new HashMap<>();
//        Person p1 = new Person("Erlan", 22);
//        Person p2 = new Person("Arman", 20);
//        Person p3 = new Person("Usman", 17);
//        data.put(p1, "KZ");
//        data.put(p2, "USA");
//        data.put(p3, "Italy");
//        Person p4 = new Person("Usman", 17);
//
//        System.out.println(data);

        List<Person> p = new ArrayList<>();
        p.add(new Person("Erlan", 29));
        p.add(new Person("Arman", 18));
        p.add(new Person("Usman", 17));
        Map<String, List<Person>> flv143X = getPassengersInfo("FLV143X", p);
        System.out.println(flv143X);
    }

    private static Map<String, List<Person>> getPassengersInfo(String flyInfo, List<Person> persons) {
        Map<String, List<Person>> data = new HashMap<>();
        data.put(flyInfo, persons);
        return data;
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
