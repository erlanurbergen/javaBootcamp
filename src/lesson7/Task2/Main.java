package lesson7.Task2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Arman", "Erlanylu", 3.3);
        Student student2 = new Student("Usman", "Nurbergen", 3.2);
        Student student3 = new Student("Madina", "Akhmetova", 3.1);

        Student students[] = {student, student2, student3};
        for (Student student1 : students) {
            System.out.println(student1.getStudentData());
        }

//        System.out.println(topStudent(students).getStudentData());

        Student student1 = Arrays.stream(students).max(Comparator.comparing(Student::getGpa)).get();
        System.out.println(student1.getStudentData());
    }

    public static Student topStudent(Student[] students){
        double maxGpa = students[0].gpa;
        Student maxGpaStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if(students[i].gpa > maxGpa){
                maxGpa = students[i].gpa;
                maxGpaStudent = students[i];
            }
        }
        return maxGpaStudent;
    }
}




class Student {
    String name;
    String surname;
    double gpa;

    public double getGpa() {
        return gpa;
    }

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
