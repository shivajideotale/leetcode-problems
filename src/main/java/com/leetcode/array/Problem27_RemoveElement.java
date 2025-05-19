package com.leetcode.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-element/
 * <p>
 * Hint 1:
 */
public class Problem27_RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0) return length;

        int validSize = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[validSize] = nums[i];
                validSize++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return validSize;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

}
