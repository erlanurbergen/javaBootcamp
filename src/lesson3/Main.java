package lesson3;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        // До новой темы разобрать эту задачу
        // https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java

        // linear array - набор однотипных значений

        // 1 вариант создания массисов
//        int array[] = new int[3]; // статический массив, основной минус что нельзя менять его размер
//        array[0] = 2;
//        array[1] = 20;
//        array[2] = -9;

        // 2 вариант создания массисов
//        int arr2[] = {1, 2, 3, 4};
//        arr2[3] = 100;
//        System.out.println(arr2[3]);

        // 3 вариант
//        System.out.println(Arrays.toString(new int[]{1, 2, 3}));

        // 1 первый вариант вывода на экран
        // System.out.println(Arrays.toString(array));

        // 2 вариант
//        for (int i : array) {
//            System.out.print(i + " ");
//        }

        // 3 вариант
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        Object objects[] = {1, true, 9.3, "Hello"};
//
//        for (Object object : objects) {
//            if (object instanceof Integer)
//                System.out.println(object);
//        }

//        int arr2[] = {1, 2, 3, 4};
        // четные числа
        // declarative approach
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] % 2 == 0)
//                System.out.println(arr2[i]);
//        }

        //imperative approach
//        System.out.println(Arrays.toString(Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray()));



        // two dimensional array

        /*

        https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java
        https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
        https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/java
        https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java
        показать тут пару вариантов


        показать задачу на two pointers


        */
//        System.out.println(Arrays.toString(invert(new int[]{1,2,3,4,5})));


        // Задача на two pointers -----------------------------------
        int arr1[] = {1, 5, 10, 12, 15};
        int arr2[] = {2, 3, 7};

        int res[] = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[index] = arr1[i];
                i++;
                index++;
            } else {
                res[index] = arr2[j];
                j++;
                index++;
            }
        }

        while (i < arr1.length){
            res[index] = arr1[i];
            i++;
            index++;
        }
        while (j < arr2.length){
            res[index] = arr2[j];
            j++;
            index++;
        }

        System.out.println(Arrays.toString(res));

        // 1 2 3 5 7 10
        // arr1 + arr2 = arr3 Arrays.sort(arr3);

        /*

            -
        1 5 10


              -
        2 3 7


        1 2 3 5 7 10
         */

    }

//    public static int[] invert(int[] array) {
////        for(int i = 0; i < array.length; i++) {
////            array[i] = array[i] * -1;
////        }
////        // 1 * -1 = -1
////        // -1 * -1 = 1
////        return array;
//        return Arrays.stream(array).map(e -> -e).toArray();
//    }

//    public static String even_or_odd(int number) {
//        //Place code here
////        if (number % 2 == 0) {
////            return "Even";
////        }
////        return "odd";
//        return number % 2 == 0 ? "Even" : "Odd";
//    }

}
