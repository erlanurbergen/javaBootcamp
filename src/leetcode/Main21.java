package leetcode;

public class Main21 {
    // 557. Reverse Words in a String III

    public static void main(String[] args) {
        System.out.println(new Main21().reverseWords("Let's take LeetCode contest"));
    }
    public String reverseWords(String s) {
        // Input: s = "Let's take LeetCode contest"
        // Output: "s'teL ekat edoCteeL tsetnoc"
        String[] s1 = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            res.append(new StringBuilder(s1[i]).reverse().toString()).append(" ");
        }

        return res.toString().trim();
    }


}
