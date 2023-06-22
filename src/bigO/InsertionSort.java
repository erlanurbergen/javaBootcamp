package bigO;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // сортировка вставками - insertion sort
        // O(n^2)
        // -3 2 5 8 10 100 101

        int arr[] = {100, -3, 101, 10, 2, 5, 8, -1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    // -3, 10 100 101 | 2, 5, 8, -1
    private static void selectionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // -3
            int j = i; // 1
            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = current;
        }
    }


}
