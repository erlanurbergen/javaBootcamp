package leetcode;

public class Main29 {
    // 2185. Counting Words With a Given Prefix
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref))
                count++;
        }

        return count;
    }
}
