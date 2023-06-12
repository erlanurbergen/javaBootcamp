package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main12 {
    // String to Integer (atoi)
    public static void main(String[] args) {
        System.out.println(new Main12().containsDuplicate(new int[]{1, 2, 3, 1}));
    }



    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!res.contains(nums[i])){
                res.add(nums[i]);
            }
        }

        return nums.length > res.size();
    }
}
