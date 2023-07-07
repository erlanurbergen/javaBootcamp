package leetcode;

public class Main49 {
    // https://leetcode.com/problems/determine-if-string-halves-are-alike/

    // 1704. Determine if String Halves Are Alike
    public static void main(String[] args) {
        System.out.println(new Main49().halvesAreAlike("textbook"));
    }
    public boolean halvesAreAlike(String s) {
        // book
        int count1 = 0;
        int count2 = 0;
        String vowels = "aeuioAEUIO";
        for (int i = 0; i < s.length()/2; i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (vowels.charAt(j) == s.charAt(i))
                    count1++;
            }
        }

        for (int i = s.length()/2; i < s.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (vowels.charAt(j) == s.charAt(i))
                    count2++;
            }
        }
        return count1 == count2;
    }
}
