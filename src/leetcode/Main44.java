package leetcode;

public class Main44 {

    // 541. Reverse String II

    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= k - 1; i++) {
            res.append(s.charAt(i));
        }
        res.reverse();
        for (int i = k ; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}
