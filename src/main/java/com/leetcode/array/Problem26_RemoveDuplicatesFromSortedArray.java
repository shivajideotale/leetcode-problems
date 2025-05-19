package com.leetcode.array;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * <p>
 * Hint 1:
 */
public class Problem26_RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 1)
            return length;

        // Start from the second element
        int idx = 1;

        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[i - 1]) {
                //nums[idx++] = nums[i]; this line equivalent to below two lines
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

}
