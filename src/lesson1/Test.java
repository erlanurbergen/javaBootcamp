package lesson1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){


        // регистрозависимость
        /**/

        // net beans
        // eclipse
        // Intellij

        // Структура проекта


        // Типы данных
        // .....
        int a = 10; // integer
        a = 9;
        byte b = 20;
        short s = 22;
        long l = 33;

        // double values

        double d = 22.3; // size sentence
        float f = 21.9f;

        // logic

        boolean check = true; // false

        // character

        char c = 'a';

        // Strings
        String text = "Hello Java!";


        // +-*/%
//        System.out.println(a + 20);
//        System.out.println(a - 20);
//        System.out.println(a * 20);
//        System.out.println(a / 20);
//        System.out.println(a % 20); // ? 10 % 7 = 3
//        System.out.println(a++); // ? 10 % 7 = 3
//        System.out.println(a--); // ? 10 % 7 = 3
        // ctrl + D



        // Scanner
        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        double d2 = input.nextDouble();
//        float f2 = input.nextFloat();

        // another option

//        String t1 = input.next(); // Hello world Almaty
//        String t2 = input.nextLine(); // Hello world
//
//        // ><>=<=!==
//        System.out.println(a > 20);
//        System.out.println(a < 20);
//        System.out.println(a >= 20);
//        System.out.println(a <= 20);
//        System.out.println(a == 20);
//        System.out.println(a != 20);

        // overload

//        System.out.println(a > 10 && a != 20 || a == 1);

        // Math

//        System.out.println(Math.sqrt(a)); // извлечение из под корня
//        System.out.println((int)Math.pow(2, 3)); // возведение в степень
//        System.out.println(Math.abs(-9)); // по модулю



//        System.out.println((int)Math.pow(2, 3)); // to cast // casting
//        System.out.println((double) 10); // to cast // casting

        // int to String
        // String to int

//        int a1 = 10;
//        String res = Integer.toString(a1);
//        int a2 = Integer.parseInt(res);
//        System.out.println(a2 + 10); // 20 1010

//            String name = "Erlan";
//            int age = 29;
//            String country = "KZ";
//        System.out.println(name + "\n" + age + "\n" + country);

        // casting



        // Условные конструкции

//        if (num1 > 20){
//            System.out.println(num1 + " greater than 20");
//        } else {
//            System.out.println("another");
//        }

        // множественная выборка

//        double mark = input.nextDouble();
//        if (mark >= 95 && mark <= 100)
//            System.out.println("A");
//        else if (mark >= 90)
//            System.out.println("A-");
//        else if (mark >= 85)
//            System.out.println("B");
//        else
//            System.out.println("Retake");


        // switch case

//        int day = input.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break; // new for you
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            default:
//                System.out.println("Incorrect day");
//        }


        // Тернарный оператор
//        String ans = num1 > 20 ? num1 + " greater than 20" : "another";
//        System.out.println(mark > 20 ? mark + " greater than 20" : "another");



        // Самостоятельная работа

        // Напишите программу, где я складываю сумму двух целостных чисел a и b?
        // Напишите программу в котором я ввожу два целостных чисел, и если первое число больше второй, то программа выведет true, иначе false.
        // Я ввожу через консоль три целостных чисел a, b и c.
        // Выполните данную операцию: a3 + 2b2 – 3ab + c3

        // 123 1 + 2 + 3 = 6
        int n1 = 123;
        // String
        int firstNumber = n1 / 100; // 1
        int secondNumber = (n1 / 10) % 10; // 2 12 % 10 = 2
        int thirdNumber = n1 % 10; // 123 % 10 = 3
        // 12 % 7 = 5
        // 100 % 9 = 1
        // 23 % 8 = 7
        //  =
        System.out.println(1234542 % 17);






    }
}


