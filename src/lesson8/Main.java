package lesson8;

import java.security.PublicKey;

public class Main {
    // инкапсуляция
    // Builder pattern
    public static void main(String[] args) {
        // В первую очередь покажи Builder pattern
        Person person = new Person.BuilderPerson()
                .withEmail("1@gmail.com")
                .withName("Erlan")
                .withAge(22)
                .withSalary(220000)
                .withAddress("Almaty")
                .build();
        System.out.println(person);

    }
}

class Person {
    String name;
    int age;
    double salary;
    String email;
    String address;
    // 2 5 = 32

    // Builder pattern
    static class BuilderPerson {

        Person person;

        public BuilderPerson () {
            person = new Person();
        }

        BuilderPerson withName(String name) {
            person.name = name;
            return this;
        }

        BuilderPerson withAge(int age) {
            person.age = age;
            return this;
        }

        BuilderPerson withSalary(double salary) {
            person.salary = salary;
            return this;
        }

        BuilderPerson withEmail(String email) {
            person.email = email;
            return this;
        }

        BuilderPerson withAddress(String address) {
            person.address = address;
            return this;
        }

        Person build() {
            return person;
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
