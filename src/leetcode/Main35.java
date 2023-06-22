package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Main35 {
    // 1941. Check if All Characters Have Equal Number of Occurrences
    public static void main(String[] args) {
        System.out.println(new Main35().areOccurrencesEqual(
                "abacbcc"
        ));
    }
    public boolean areOccurrencesEqual(String s) {
        // Input: s = "abacbcc"
        // Output: true
        Map<Character, Integer> data = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                System.out.println(s.charAt(i) + " " + s.charAt(j));
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            data.put(s.charAt(i), count);
            if (s.indexOf(s.charAt(i)) == s.indexOf(s.charAt(i + 1)))
                continue;
        }
        System.out.println(data);

        return true;
    }
}
