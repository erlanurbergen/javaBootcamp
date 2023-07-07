package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main48 {
    // https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
    // 2160. Minimum Sum of Four Digit Number After Splitting Digits
    public static void main(String[] args) {
        System.out.println(new Main48().minimumSum(4009));
    }

    public int minimumSum(int num) {
        // Input: num = 2932
        // Output: 52
        // Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
        // The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.

        // Input: num = 4009
        // Output: 13
        // Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc.
        // The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
        String numbers = Integer.toString(num);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++) {
            nums.add(Character.getNumericValue(numbers.charAt(i)));
        }

        Collections.sort(nums);
        return (nums.get(0) * 10 + nums.get(2)) + (nums.get(1) * 10 + nums.get(3));


    }
}
