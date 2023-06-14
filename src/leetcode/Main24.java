package leetcode;

public class Main24 {
    // 1967. Number of Strings That Appear as Substrings in Word

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i]))
                count++;
        }

        return count;
    }
}
