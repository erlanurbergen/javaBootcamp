package leetcode;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(new Main6().balancedStringSplit("RLRRLLRLRL"));
    }

    public int balancedStringSplit(String s) {
        int rigthCount = 0;
        int leftCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                rigthCount++;
            else
                leftCount++;

            if (leftCount == rigthCount)
                count++;
        }

        return count;
    }
}
