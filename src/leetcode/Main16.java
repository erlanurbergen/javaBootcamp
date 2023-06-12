package leetcode;

import java.util.*;

public class Main16 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main16().intersect(new int[]{1,2,2,1},
                new int[]{2})));
    }

    //350. Intersection of Two Arrays II
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        // Input: nums1 = [1,2,2,1], nums2 = [2,2]
        // Output: [2,2]
        Set<Integer> s1 = new HashSet();
        if (nums1.length == 1) {
            s1.add(nums1[0]);
        }

        if (nums2.length == 1){
            s1.add(nums2[0]);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (s1.contains(nums1[i]))
                break;
            for (int i1 = 0; i1 < nums2.length; i1++) {
                if (nums1[i] == nums2[i1]) {
                    res.add(nums1[i]);
                    break;
                }

            }
        }
        int arr[] = new int[s1.size()];
        int index = 0;
        for (Integer integer : s1) {
            arr[index] = integer;
        }
        if (!s1.isEmpty()) {
           return arr;
        }

        int array[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }

        return array;

    }
}
