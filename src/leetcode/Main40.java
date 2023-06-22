package leetcode;

public class Main40 {

    // 2006. Count Number of Pairs With Absolute Difference K
    // https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
    public static void main(String[] args) {
        System.out.println(new Main40().countKDifference(new int[]{1,3}, 3));
    }
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
