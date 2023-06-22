package leetcode;

import java.util.Arrays;

public class Main37 {
    // 242. Valid Anagram
    public static void main(String[] args) {
        System.out.println(new Main37().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        System.out.println(chars);
        System.out.println(chars2);
        return Arrays.equals(chars, chars2);

    }
}
