package lesson6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println();
//        String text = Integer.toString(1);
//        System.out.println(Arrays.toString(new int[]{1, 2}));

        // Методы
        // Строки

        // Задачи
        // полиндром
        // https://edabit.com/challenge/c52kNwPuWo5kp9x4H
        // https://edabit.com/challenge/zSqXDoWS8PuhbbPrL
        // https://edabit.com/challenge/KWbrmP9uYSnYtwkAB
        // Сложная задача https://edabit.com/challenge/7r4Hz8MvJq4sbHhXB
//        int sum = new Main().getSum();
//        System.out.println(sum + 10);
//        new Main().print();
    }
    // модификатор доступа (2) -> тип возвращаемого значения -> название -> аргументы
    // public - доступ во всем проекте
    // default - доступ только внутри package
    // protected -
    // private -


//    тип возвращаемого значения - void (пустота)
//    тип возвращаемого значения - что то возвращает
    public void print() {
        System.out.println("Hello from print");
    }

    public int getSum() {
        return 10 + 10;
    }

    public String[] getArrays() {
        return new String[] {
                "kjkjhsdj", "skdjkjskdj", "sjdkjskdjs"
        };
    }

    public List<String> names() {
        // полиморфизма
        return List.of("sdjsdj", "skndsd", "sndjnjsd");
    }
}