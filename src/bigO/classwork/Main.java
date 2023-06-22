package bigO.classwork;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Erlan", 20, 3.5),
                new Student("Asan", 19, 3.4),
                new Student("Renat", 21, 3.2),
                new Student("Ernar", 18, 3.6)
        };
        SortedStudent s = new SortedStudent();
        s.printStudents(s.sortedByAverageGrade(students));
    }

}
class Student {
    private String name;
    private int age;
    private double averageGrade;

    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
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

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
