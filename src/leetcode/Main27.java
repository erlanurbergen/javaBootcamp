package leetcode;

import java.util.ArrayList;

public class Main27 {
    // 2108. Find First Palindromic String in the Array
    public static void main(String[] args) {
        System.out.println(new Main27().firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }

    public String firstPalindrome(String[] words) {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(new StringBuilder(words[i]).reverse().toString())) {
                data.add(words[i]);
            }
        }
        if (data.isEmpty())
            return "";
        System.out.println(data);
        return data.get(0);
    }
}
