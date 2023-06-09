package lesson6;

import java.util.Locale;

public class Tasks {
    public static void main(String[] args) {
        // oppo
        // kazak
        // aziza
        // // полиндром
        System.out.println(isInOrder("123"));
    }

    // полиндром
    private static boolean polindrom(String text) {
        return text.toLowerCase()
                .equals(new StringBuilder(text.toLowerCase())
                        .reverse()
                        .toString());
//        String newText = "";
//        for (int i = text.length(); i >= 0 ; i--) {
//            newText += text.charAt(i);
//        }
//
//        return text.equals(newText);
    }

    // https://edabit.com/challenge/c52kNwPuWo5kp9x4H
    private static String flipEndChars(String data) {
        StringBuilder res = new StringBuilder();
        if (data.length() == 1) {
            return "Incompatible.";
        } else {
            // charAt(0)
            // charAt(data.length() - 1)
            // mouse
            for (int i = 1; i <= data.length() - 2; i++) {
                res.append(data.charAt(i));
            }

            return data.charAt(data.length() - 1) + res.toString() + data.charAt(0);
        }
    }

    // https://edabit.com/challenge/KWbrmP9uYSnYtwkAB
    private static boolean isInOrder(String order) {
        // мы делаем через ascii
        // xyzz
        int count = 0;
        for (int i = 0; i < order.length() - 1; i++) {
            if (order.charAt(i) <= order.charAt(i + 1))
                count++;
        }

        return count == order.length() - 1;

    }

    public static boolean validateEmail(String email){
        int indexOfSobachka = email.indexOf("@");
        int indexOfDot = email.lastIndexOf(".");
        return email.contains("@") && email.contains(".") && indexOfSobachka < indexOfDot
                && indexOfSobachka > 0;

    }

}
