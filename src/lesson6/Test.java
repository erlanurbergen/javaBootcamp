package lesson6;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        sum();
//        sum(10);
//        System.out.println(sum(10,10));
//
        // строки
        // 20% любого ЯП это строки
        String text = "Hello";
        //String не изменяемый тип данных
//        int array[] = {1, 2, 3};
//        System.out.println(array.length);
//        System.out.println(text.length());

        // charAt() - индексация
//        System.out.println(text.charAt(2)); // array[1]
//
//        // регистры
//        String s = text.toLowerCase();
//        System.out.println(s);
//        System.out.println(text.toUpperCase());

        // equals() сравнение строк
//        System.out.println(text.equals("hello"));

//        System.out.println(text.equalsIgnoreCase("hello"));

        // concat - объединение строк (+)
//        String res = text.concat("123");
//        System.out.println(text + "123");

        // contains() - вхождение строки в строку
//        System.out.println(text.contains("oll"));

        // startsWith
//        System.out.println(text.startsWith("He"));
//        System.out.println(text.endsWith("llo"));

        // substring
//        System.out.println(text.substring(1));

        //indexOf
//        System.out.println(text.indexOf('l'));

        // split
//        String message = "Hello my friend";
//        String[] s = message.split(" ");// трансфер в массив
//        System.out.println(Arrays.toString(s));
//
//        // replace
//        String replace = message.replace(" ", "1");
//        System.out.println(replace);

        // trim
//        String message = " Hello my friend ";
//        String trim = message.trim();
//        System.out.println(message);

        //isEmpty()
        String n = "";
        System.out.println(n.isEmpty());
    }

    // overloading
    public static void sum() {

    }

    public static void sum(int a){
        System.out.println(a + 10);
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
