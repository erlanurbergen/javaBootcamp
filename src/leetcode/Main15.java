package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main15 {
    // 349. Intersection of Two Arrays

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main15().intersection(new int[]{4, 9, 5}, new int[]{9,4,9,8,4})));
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        // Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        // Output: [9,4]
        // Explanation: [4,9] is also accepted.

        Set<Integer> integers1 = new HashSet();
        Set<Integer> integers2 = new HashSet();

        for (int i = 0; i < nums1.length; i++) {
            integers1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            integers2.add(nums2[i]);
        }

        integers1.retainAll(integers2);
        int res[] = new int[integers1.size()];
        int index = 0;
        for (Integer integer : integers1) {
            res[index] = integer;
            index++;
        }
        return res;
    }
}
