package leetcode;

import java.util.Arrays;

public class Main46 {
    // 1480. Running Sum of 1d Array
    // https://leetcode.com/problems/running-sum-of-1d-array/submissions/977563947/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Main46().runningSum(
                        new int[]{1,2,3,4}
                )
        ));
    }
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < i+1; j++) {
                sum += nums[j];
            }
            arr[i] = sum;
        }

        return arr;


    }
}
