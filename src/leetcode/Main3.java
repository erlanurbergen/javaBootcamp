package leetcode;

public class Main3 {
    public static void main(String[] args) {
        // Input: jewels = "aA", stones = "aAAbbbb"
        // Output: 3

        // Input: jewels = "z", stones = "ZZ"
        // Output: 0
        System.out.println(new Main3().numJewelsInStones("aA", "aAAbbbb"));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j))
                    count++;
            }
        }
        return count;
    }
}
