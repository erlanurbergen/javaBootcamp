package leetcode;

public class Main20 {

    // 1768. Merge Strings Alternately
    public static void main(String[] args) {
        System.out.println(new Main20().mergeAlternately("ab", "pqrs"));
    }

    public String mergeAlternately(String word1, String word2) {
        int word1Index = 0;
        int word2Index = 0;
        StringBuilder res = new StringBuilder();
        while (word1Index < word1.length() && word2Index < word2.length()) {
            res.append(word1.charAt(word1Index));
            res.append(word2.charAt(word2Index));
            word1Index++;
            word2Index++;
        }

        System.out.println(word1Index);
        System.out.println(word2Index);

        while (word1Index < word1.length()) {
            res.append(word1.charAt(word1Index));
            word1Index++;
        }

        while (word2Index < word2.length()) {
            res.append(word2.charAt(word2Index));
            word2Index++;
        }

        return res.toString();
    }
}
