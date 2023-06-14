package leetcode;

public class Main25 {
    // 2000. Reverse Prefix of Word

    public static void main(String[] args) {
        System.out.println(new Main25().reversePrefix("abcdefd", 'd'));
    }

    public String reversePrefix(String word, char ch) {
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch){
                index = i;
                break;
            }
        }

        StringBuilder res = new StringBuilder(word.substring(0, index + 1)).reverse();
        res.append(word.substring(index+1));
        return res.toString();

    }
}
