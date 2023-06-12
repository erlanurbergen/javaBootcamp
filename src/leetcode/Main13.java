package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Main13 {
    public static void main(String[] args) {
        System.out.println(new Main13().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    // 1832. Check if the Sentence Is Pangram
    public boolean checkIfPangram(String sentence) {
        Set<Character> res = new HashSet();
        for (int i = 0; i < sentence.length(); i++) {
            if (!res.contains(sentence.charAt(i)))
                res.add(sentence.charAt(i));
        }
        System.out.println(res.size());

        return res.size() == 26;
    }
}
