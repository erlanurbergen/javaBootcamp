package leetcode;

public class Main5 {
    public static void main(String[] args) {
        System.out.println(new Main5().mostWordsFound(new String[]{
                "alice and bob love leetcode", "i think so too", "this is great thanks very much"
        }));
    }

    public int mostWordsFound(String[] sentences) {
        // Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
        //Output: 6
        //Explanation:
        //- The first sentence, "alice and bob love leetcode", has 5 words in total.
        //- The second sentence, "i think so too", has 4 words in total.
        //- The third sentence, "this is great thanks very much", has 6 words in total.
        //Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            if (s.length > max)
                max = s.length;
        }
        return max;
    }
}
