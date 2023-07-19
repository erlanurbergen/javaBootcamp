package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // stream api jdk 8
        // jdk
        // API application programming interface json
        // stream api - удобная работа с коллекциями, да и в целом со структурами данных
        // Java se standard edition
        // Java SE
        // Java EE enterprise
        // Java ME micro
        // Mobile android (legacy)



        // imperative approach good practice
        // foreach
//        numbers.stream().filter(n -> n > 0).forEach(System.out::println);
//        long count2 = 0;
//
//        // declarative approach bad practice
//        for (Integer number : numbers) {
//            if (number > 0)
//                count2++;
//        }
//        System.out.println(count2);

//        List<String> userData = new ArrayList<>();
//        Collections.addAll(userData, "Erlan@gmail.com", "Gizat@mail.ru", "Alikhan@gmail.com");
//        userData.stream().filter(s -> s.endsWith(".com")).forEach(System.out::println);

//        ArrayList<Integer> numbers = new ArrayList<>();
//        Collections.addAll(numbers, 1, 2, -9, 10, 20, 30);
//        // filter
//        // reduce
//        // map
//        long res = numbers.stream().reduce(0, Integer::sum);
//        System.out.println(res);

//        ArrayList<Person> people =
//                new ArrayList<>();
//
//        people.add(new Person("Erlan", 29, "1@gmail.com"));
//        people.add(new Person("Arman", 20, "2@gmail.com"));
//        people.add(new Person("Usman", 18, "3@gmail.com"));
//
////        List<String> strings = people.stream().map(p -> p.getName()).toList();
////        System.out.println(strings);
//
//        // sorting
//
//        people.stream()
//                .sorted(Comparator.comparing(Person::getName))
//                .forEach(System.out::println);

        // grouping
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("person1", 22, "person1@gmail.com", Group.SIS12));
//        people.add(new Person("person2", 29, "person2@gmail.com", Group.VTIPO10));
//        people.add(new Person("person3", 20, "person3@gmail.com", Group.MANAGEMENT103));
//        people.add(new Person("person4", 18, "person4@gmail.com", Group.SIS12));
//        people.add(new Person("person5", 17, "person5@gmail.com", Group.VTIPO10));
//
//        Map<Group, List<Person>> collect =
//                people.stream()
//                        .collect(Collectors.groupingBy(Person::getGroup));
//
//        collect.forEach((group, people1) -> {
//            System.out.println(group);
//
//            people1.forEach(System.out::println);
//        });

        // max min

//        ArrayList<Integer> numbers = new ArrayList<>();
//        Collections.addAll(numbers, 1, 2, -9, 10, 20, 30);
//        boolean check = numbers.stream().min(Integer::compare).isPresent();// null
//        System.out.println(check);

                ArrayList<Person> people =
                new ArrayList<>();

        people.add(new Person("person1", 22, "person1@gmail.com", Group.SIS12));
        people.add(new Person("person2", 29, "person2@gmail.com", Group.VTIPO10));
        people.add(new Person("person3", 20, "person3@gmail.com", Group.MANAGEMENT103));
        people.add(new Person("person4", 18, "person4@gmail.com", Group.SIS12));
        people.add(new Person("person5", 17, "person5@gmail.com", Group.VTIPO10));
        people.add(new Person("person5", 17, "person5@gmail.com", Group.VTIPO10));

//        List<String> strings = people.stream().map(p -> p.getName()).toList();
//        System.out.println(strings);

        Set<String> collect = people.stream()
                .map(x -> x.getName())
                .collect(Collectors.toSet());
        System.out.println(collect);
    }
}

enum Group {
    SIS12, VTIPO10, MANAGEMENT103
}

class Person {
    private String name;
    private int age;
    private String email;
    private Group group;

    public Person(String name, int age, String email, Group group) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", group=" + group +
                '}';
    }
}
