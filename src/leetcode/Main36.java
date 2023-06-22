package leetcode;

public class Main36 {
    // 1332. Remove Palindromic Subsequences
    public int removePalindromeSub(String s) {
        // Input: s = "abb"
        // Output: 2
        // Explanation: "abb" -> "bb" -> "".
        // Remove palindromic subsequence "a" then "bb".
        if (s.length() == 0)
            return 0;
        if (s.equals(new StringBuilder(s).reverse().toString()))
            return 1;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(i) - i - 1)
                return 2;
        }
        return 1;



    }
}
