package leetcode;

public class Main19 {
    public static void main(String[] args) {
        System.out.println(new Main19().truncateSentence("Hello how are you Contestant", 4));
    }
    // 1816. Truncate Sentence

    // Input: s = "Hello how are you Contestant", k = 4
    //Output: "Hello how are you"
    //Explanation:
    //The words in s are ["Hello", "how" "are", "you", "Contestant"].
    //The first 4 words are ["Hello", "how", "are", "you"].
    //Hence, you should return "Hello how are you".
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            res.append(s1[i]).append(" ");
        }
        return res.toString().trim();
    }
}
