package leetcode;


import java.util.Random;

public class Main17 {
    public static void main(String[] args) {
        /*
        Дано: функция int random(int n), возвращающая произвольное число
        от 0 до n.
    Задача 1. Написать функцию, int[] randomArray(),
    которая сгенерирует массив случайной длины в диапазоне от 2 до 100,
    заполнит его случайными числовыми значениями от 1 до n-1
    (где n - размер массива) и вернет его. Для генерации
чисел необходимо использовать описанную выше функцию random(int n)
         */
    }
    static int random (int n) {
        return new Random().nextInt(n + 1); //
    }
    
    static int[] randomArray(int n) {

        int array[] = new int[random(100-2) + 2];
        for (int i = 0; i < array.length; i++) {
            array[i] = random((array.length - 2)) + 1;
        }
        return array;

    }
}
