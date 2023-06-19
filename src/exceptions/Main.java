package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        try {
//            System.out.println(10 / a);
//        } catch (ArithmeticException arithmeticException) {
//            System.err.println("ArithmeticException");
//        } catch (InputMismatchException n) {
//            System.err.println("InputMismatchException");
//        } finally {
//            System.out.println("Данный блок сработает полюбому");
//        }
//        System.out.println("Done after checking exceptions");
//        new Some().checkException();

        // throw
        // Иногда в программах нам необходимо искуственно вызывать исключения
//        checkThrow(new int[]{1, 2, 3});

        int arr[] = {1, 2};
        if (arr.length == 2)
            throw new MyException("размер равен 2");
    }

    private static void checkThrow(int arr[]) {
        if (arr.length == 3) {
            try {
                throw new Exception("Размер массива равен 3");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }
}

// можно создавать свои классы Исключения
class MyException extends Exception {
    private int arrLength;

    public MyException(String message) {
        super(message);


    }
}

//class Some {
//
//    // throws -> try catch
//    public void checkException()  {
//        try {
//            FileReader fileReader = new FileReader("text.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
////        FileReader fileReader = new FileReader("text.txt");
//
//    }
//}
