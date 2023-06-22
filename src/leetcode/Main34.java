package leetcode;

public class Main34 {
    // 896. Monotonic Array

    public static void main(String[] args) {
        System.out.println(new Main34().isMonotonic(new int[]{1, 2, 2, 3}));
    }
    public boolean isMonotonic(int[] nums) {
        // Input: nums = [1,2,2,3]
        // Output: true
        int count = 0;
        if (nums[0] > nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]){
                    count++;
                }


            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1]){
                    count++;
                }


            }
        }
        return count == nums.length - 1;
    }
}
