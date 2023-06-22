package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main42 {
    public static void main(String[] args) {
        System.out.println(7 % 2 == 0);
    }

    // 2351. First Letter to Appear Twice
    // https://leetcode.com/problems/first-letter-to-appear-twice/

    public char repeatedCharacter(String s) {
        Set<Character> res = new HashSet();
        for(int i = 0; i < s.length(); i++) {
            if(res.contains(s.charAt(i))){
                return s.charAt(i);
            }
            res.add(s.charAt(i));
        }
        return '1';
    }
}
