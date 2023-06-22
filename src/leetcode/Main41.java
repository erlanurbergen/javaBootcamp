package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Main41 {
    // 1748. Sum of Unique Elements
    // https://leetcode.com/problems/sum-of-unique-elements/
    public static void main(String[] args) {
        System.out.println(new Main41().sumOfUnique(
                new int[]{10,6,9,6,9,6,8,7}
        ));
        // 1 2 2 3
    }
    public int sumOfUnique(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 0)
                sum += nums[i];
        }
        return sum;
    }
}
