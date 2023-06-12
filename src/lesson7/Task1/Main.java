package lesson7.Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Arman", "Erlanylu", 3.3);
        Student student2 = new Student("Usman", "Nurbergen", 3.2);
        Student student3 = new Student("Madina", "Akhmetova", 3.1);

        Student students[] = {student, student2, student3};
        for (Student student1 : students) {
            System.out.println(student1.getStudentData());
        }
    }
}

class Student {
    String name;
    String surname;
    double gpa;

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }


    public String getStudentData() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
