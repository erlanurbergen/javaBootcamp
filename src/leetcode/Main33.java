package leetcode;

import java.util.Arrays;

public class Main33 {
    // 1365. How Many Numbers Are Smaller Than the Current Number
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Main33().smallerNumbersThanCurrent(
                new int[]{8,1,2,2,3}
        )));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Input: nums = [8,1,2,2,3]
        // Output: [4,0,1,1,3]
        int res[] = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    count++;
            }
            res[i] = count;
        }
        return res;

    }
}
