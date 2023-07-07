//package dataStructures.mapAndSet;
//
//import java.util.*;
//
//public class MapMain {
//    public static void main(String[] args) {
//        // Что такое Map
//        // уникальность ключей
//        // методы Map
//        // put
//        // putIfAbsent
//        // get
//        // remove
//        // containsValue
//        // containsKey
//        // keySet
//        // values ,n   n,mnz//        System.out.println(data.values());
//
////        Map<Person, String> data = new HashMap<>();
////        Person p1 = new Person("Erlan", 22);
////        Person p2 = new Person("Arman", 20);
////        Person p3 = new Person("Usman", 17);
////        data.put(p1, "KZ");
////        data.put(p2, "USA");
////        data.put(p3, "Italy");
////        Person p4 = new Person("Usman", 17);
////
////        System.out.println(data);
//
//        List<Person> p = new ArrayList<>();
//
//        p.add(new Person("Erlan", 29));
//
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (!(o instanceof Person)) return false;
////        Person person = (Person) o;
////        return age == person.age && Objects.equals(name, person.name);
////    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
