package exceptions.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            new Calculator().divideNumbers(10, Integer.parseInt("0"));
        } catch (NumberFormatException n){
            System.out.println("введены некорректные данные. Пожалуйста, введите целое число");
        } catch (ArithmeticException a) {
            System.out.println("деление на ноль");
        }
    }
}

class Calculator {
    public void divideNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }
}
