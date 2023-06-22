package bigO.classwork;

public class SortedStudent {

    public Student[] sortedByAverageGrade(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = getMinIndex(arr, i);
            Student temp = arr[i]; // 10 -3
            arr[i] = arr[index]; // 10 -> -3
            arr[index] = temp;

        }

        return arr;
    }

    private static int getMinIndex(Student arr[], int start) {
        int index = start;
        Student minValue = arr[start]; // временно минимальным эл-ом яв-ся первый элемент
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i].getAverageGrade() < minValue.getAverageGrade()) {
                minValue = arr[i];
                index = i;
            }
        }

        return index;
    }

    public void printStudents(Student arr[]){
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
