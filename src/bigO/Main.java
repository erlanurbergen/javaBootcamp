package bigO;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // O(N)

        // Константное время или О(1)
//        int arr[] = {10, 22, -9, 8, 10};
//        System.out.println(arr[2]);

        // Линейная сложность О(N)
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }

        // Квадратичная сложность O(N^2)
//        for (int i = 0; i < arr.length; i++) {
//            for (int i1 = 0; i1 < arr.length; i1++) {
//
//            }
//        }

//        int arr2[][] = {{10, 29}, {9, 10}};
        // Сложность O(A * B)
//        int sum2 = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            for (int i1 = 0; i1 < arr2.length; i1++) {
//                sum2 += arr2[i][i1];
//            }
//        }
        // Отбрасывание не доминантных констант
//        for (int i = 0; i < ; i++) {
//
//        }
//
//        for (int i = 0; i < ; i++) {
//
//        }

        // O(N)
        // Линейный поиск

        // Бинарный поиск


        // Рекурсия



        // Bubble sort
        /*
        100 -3 2 7 10 4 25
         -3 100 2 7 10 4 25
         -3 2 100 7 10 4 25
         -3 2 7 100 10 4 25
         -3 2 7 10 100 4 25
         -3 2 7 10 4 100 25
         -3 2 7 10 4 25 100
        * */





//        int arr[] = new int[100000000];
//        long time = System.currentTimeMillis();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//        System.out.println(binarySearch(arr, 100000000 - 1));
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - time + " ms");


        Scanner scanner = new Scanner(System.in);
//        int secretNumber = new Random().nextInt(101); // 1 - 100
//
//        for (int i = 0; i < 8; i++) {
//            System.out.println("Попытка " +  i);
//            int myNumber = scanner.nextInt();
//            if (myNumber == secretNumber){
//                System.out.println("Вы угадали число, с попытки " + i);
//                break;
//            }
//            else if (myNumber > secretNumber) {
//                System.out.println("Ваше число больше заданного");
//            } else {
//                System.out.println("Ваше число меньше заданного");
//            }
//        }
//        System.out.println("Игра окончена");

        int arr[] = {-9, 2, 1, -8, 100, 25};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }


    // linear search
    private static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }



    // binary search
    // массив должен быть отсортирован
    // он находит центр(индекс и элемент)
    // идет смешение
    /*
    -9 -8 1 4 7 10 18 22 88         target 22
    start = 0
    end = array.length - 1
    middle = start + (end - start) / 2
    if array[middle] == target
         return middle;
    else if array[middle] > target
        end = middle - 1
    else
        start = middle + 1

    *
    */

    // binary search
    private static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int middle;

        while(start <= end) {
            middle = start + (end - start) / 2;
            if (arr[middle] == target)
                return middle;
            if(arr[middle] > target)
                end = middle - 1;
            else
                start = middle + 1;
        }
        return -1;
    }

    // bubble sort
    private static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("Сейчас сравнивается " +  arr[j] + " с " +  arr[j+1]);
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

}
