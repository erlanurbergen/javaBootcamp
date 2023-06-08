package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 2-x arrays
        /*

        [              j(столбцами)
         i(строками)   [1, 2, 3]
                       [4, 6, 7] i = 1, j = 2
                       [10. 3, -1]
        ]
         */
//        int array[][] = {
//                {1, 2, 3},
//                {4, 6, 7},
//                {10, 3, -1}
//        };

//        System.out.println(Arrays.toString(array[1]));
        Scanner scanner = new Scanner(System.in);
//        int array[] = new int[3];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        System.out.println(array);
        int array[][] = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                array[i][i1] = scanner.nextInt();
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i == j) {
                    array[i][j] = 1;
                } else if (i < j) {
                    array[i][j] = 2;
                }
                else {
                    array[i][j] = 0;
                }

            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
            // 3 3 4 4 5 5
        }

        /*

        1 2 2
        0 1 2
        0 0 1


        1
        0
        3
         */

//        for (int i = 0; i < array.length; i++) {
//            for (int i1 = 0; i1 < array.length; i1++) {
//                System.out.println(array[i][i1]);
//            }
//
//        }

    }
}
