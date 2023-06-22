package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Main38 {

    // 1089. Duplicate Zeros
    public static void main(String[] args) {
        int arr[] = new int[]{1,0,2,3,0,4,5,0};
        new Main38().duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                nums.add(0);
                nums.add(0);
            } else
                nums.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums.get(i);
        }

    }
}
