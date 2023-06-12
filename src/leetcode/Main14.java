package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main14 {

    // 2215. Find the Difference of Two Arrays
    public static void main(String[] args) {

        System.out.println(new Main14().findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> integers1 = new HashSet<>();
        Set<Integer> integers2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            integers1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            integers2.add(nums2[i]);
        }

        Set<Integer> res1 = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();


        for (int i = 0; i < nums2.length; i++) {
            if (!integers1.contains(nums2[i])) res1.add(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (!integers2.contains(nums1[i])) res2.add(nums1[i]);
        }

        List<Integer> list1 = new ArrayList<>(res2);
        List<Integer> list2 = new ArrayList<>(res1);

        res.add(list1);
        res.add(list2);

        return res;

    }
}
