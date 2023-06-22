package leetcode;

import java.util.Arrays;

public class Main43 {

    // 2206. Divide Array Into Equal Pairs
    // https://leetcode.com/problems/divide-array-into-equal-pairs/
    public static void main(String[] args) {
        System.out.println(new Main43().divideArray(
                new int[]{3,2,3,2,2,2}
        ));
    }

    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0)
            return false;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i+=2) {
            // 2 2 2 2 3 3
            if (nums[i] == nums[i + 1])
                count++;
        }

        return count == nums.length / 2;
    }
}
