package io.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // serialization
//        List<Student> student = getStudent();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("ccc.mmm")
//        );
//
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("ccc.mmm"));
        List<Student> students = (List<Student>)objectInputStream.readObject();
        students.forEach(System.out::println);
        objectInputStream.close();

    }

    private static List<Student> getStudent() {

        return List.of(
                new Student("Gizat", 3.7),
                new Student("Alikhan", 3.4),
                new Student("Alisher", 3.5)
        );
    }
}

class Student implements Serializable {
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
