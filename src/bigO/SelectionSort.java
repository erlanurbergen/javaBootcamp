package bigO;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        // selection sort - сортировка выбором
        // O(N)
        int arr[] = {10, 3, 2, 0, 100, 200, 7, -1};
        // -1, 3, 2, 0, 100, 200, 7, 10
        // -1 0 2 3 7 10 100 200

        for (int i = 0; i < arr.length; i++) {
            int index = getMinIndex(arr, i);
            System.out.println("Current element " + arr[index]);
            int temp = arr[i]; // 10 -3
            arr[i] = arr[index]; // 10 -> -3
            arr[index] = temp;

        }

        System.out.println(Arrays.toString(arr));

    }


    // поиск минимального индекса в массиве
    private static int getMinIndex(int arr[], int start) {
        int index = start;
        int minValue = arr[start]; // временно минимальным эл-ом яв-ся первый элемент
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                index = i;
            }
        }

        return index;
    }


}
