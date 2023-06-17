package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Main31 {
    public static void main(String[] args) {
        System.out.println(new Main31().areOccurrencesEqual("abcab"));
    }
    // 1941. Check if All Characters Have Equal Number of Occurrences
    public boolean areOccurrencesEqual(String s) {
        Set<Character> res = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            res.add(s.charAt(i));
        }

        return s.length() % res.size() == 0;
    }
}
