package leetcode;

public class Main47 {
    // 2535. Difference Between Element Sum and Digit Sum of an Array
    public static void main(String[] args) {
        System.out.println(new Main47().differenceOfSum(
                new int[]{1,15,6,3}
        ));
    }
    public int differenceOfSum(int[] nums) {
        // Input: nums = [1,15,6,3]
        //Output: 9
        //Explanation: 
        //The element sum of nums is 1 + 15 + 6 + 3 = 25.
        //The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
        //The absolute difference between the element sum and digit sum is |25 - 16| = 9.
        int sum = 0; // общая сумма всех чисел
        int allDigitSum = 0; // общая сумма всех цифр
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > 9) {
                String integer = Integer.toString(nums[i]);
                for (int j = 0; j < integer.length(); j++) {
                    allDigitSum += Character.getNumericValue(integer.charAt(j));
                }
            }
            if (nums[i] > 9)
                continue;
            allDigitSum += nums[i];
        }

        System.out.println(sum);
        System.out.println(allDigitSum);

        return sum - allDigitSum;
    }
}
