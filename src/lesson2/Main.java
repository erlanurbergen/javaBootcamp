package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // для ввода с консоли
        // loops
        // циклы это повторение какого то участка кода до определенного условия

        // for
//        for (int i = 0; i < 10; i++) {
//            // int i = 0; начало цикла
//            // i < 10; условие (завершение цикла)
//            // i++ шаг
//            System.out.println(i + ": Welcome Java");
//            if (i == 5)
//                break; // условие выхода
//
//        }
//        int sum = 0; // здесь будет суммироваться наш а
//        int count = 0;
//        for (;;) {
//            System.out.println("Insert a: ");
//            int a = scanner.nextByte();
//            if (a == 0)
//                break;
//            if (a % 2 == 0) // четность,
//                sum += a;
//            count++;
//        }
//        System.out.println(sum);
//        System.out.println(sum / count);



        // while

//        int i = 0;
//        while (i < 10) {
//            System.out.println("welcome");
//            i++;
//
//        }

        // do while
//        int i = 0;
//        do {
//            System.out.println("plus");
//            i++;
//        }while (i > 110); // false

        // Inputs:
        // a, b
        // result = a * b
        // *, для этого используем цикл
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int sum = 0; // для суммирования
//        for (int i = 0; i < b; i++) {
//            sum += a;
//        }
//        System.out.println(sum);

//        for (int i = 0; i < 4; i++) { // внешний цикл
//            System.out.print(i + " ");
//            for (int j = 1; j <= 5; j++) {
//                // i = [ [] [] [] [] [] ] ----- [ [] [] [] [] [] ] ------[ ] -------- [ ]
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++) { // 2 5
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }



        /*


        1
        2 3
        4 5 6
        7 8 9 10

        */
        
        // arrays

        // array inits option



        // foreach

    }
}
