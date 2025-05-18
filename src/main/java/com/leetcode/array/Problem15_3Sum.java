package com.leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/description/
 * <p>
 * Hint 1: So, we essentially need to find three numbers x, y, and z such that they add up to the given value. If we fix one of the numbers say x, we are left with the two-sum problem at hand!
 */
public class Problem15_3Sum {

    private static final List<List<Integer>> RESULT = new LinkedList<>();

    public static List<List<Integer>> threeSum(int[] nums) {
        // Sort array before finding three sum so that we can use two pointer technique to find 'b' and 'c'
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            /**
             * To avoid duplicate 'a' added below check.
             * If i is equal to ZERO then using num[i] as 'a'
             * If i is greater than ZERO then checking value of 'a' with previously added 'a' if it is same then skipping it.
             */
            if (i == 0 || i > 0 && a != nums[i - 1]) {
                int target = -(a);
                twoSum(a, i + 1, nums.length - 1, nums, target);
            }
        }
        return RESULT;
    }

    private static void twoSum(int a, int bPointer, int cPointer, int[] nums, int target) {
        // Using two pointer technique to find 'b' and 'c'
        while (bPointer < cPointer) {
            int sum = nums[bPointer] + nums[cPointer];
            if (sum == target) {
                RESULT.add(List.of(a, nums[bPointer], nums[cPointer]));

                // To avoid duplicate 'b' and 'c' added below check.
                while (bPointer < cPointer && nums[bPointer] == nums[bPointer + 1]) bPointer++;
                while (bPointer < cPointer && nums[cPointer] == nums[cPointer - 1]) cPointer--;

                bPointer++;
                cPointer--;
            } else if (sum < target) {
                bPointer++;
            } else if (sum > target) {
                cPointer--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}
