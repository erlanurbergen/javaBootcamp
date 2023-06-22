package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Main39 {

    // 2540. Minimum Common Value
    // https://leetcode.com/problems/minimum-common-value/

    public static void main(String[] args) {
        System.out.println(new Main39().getCommon(new int[]{1,2,3}, new int[]{2,4,3}));
    }
    public int getCommon(int[] nums1, int[] nums2) {

        // Input: nums1 = [1,2,3], nums2 = [2,4]
        // Output: 2
        // Explanation: The smallest element common to both arrays is 2,
        // so we return 2.

            // test case прошли, но time limited ошибка
//        ArrayList<Integer> res = new ArrayList<>();
//        if (nums1.length > nums2.length) {
//            for (int i = 0; i < nums2.length; i++) {
//                for (int j = 0; j < nums1.length; j++) {
//                    if (nums2[i] == nums1[j])
//                        res.add(nums2[i]);
//                }
//            }
//        } else {
//            for (int i = 0; i < nums1.length; i++) {
//                for (int j = 0; j < nums2.length; j++) {
//                    if (nums1[i] == nums2[j])
//                        res.add(nums1[i]);
//                }
//            }
//        }
//
//        return Collections.min(res);

        int index1 = 0;
        int index2 = 0;

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                return nums1[index1];
            } else if (nums1[index1] > nums2[index2]){
                index1++;
            } else{
                index2++;
            }
        }

        return -1;
    }
}
