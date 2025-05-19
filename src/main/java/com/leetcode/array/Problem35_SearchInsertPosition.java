package com.leetcode.array;

/**
 * https://leetcode.com/problems/search-insert-position/
 * <p>
 * Hint 1:
 */
public class Problem35_SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) return length;

        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println((searchInsert(new int[]{1, 3, 5, 6}, 5)));

        System.out.println((searchInsert(new int[]{1, 3, 5, 6}, 2)));

        System.out.println((searchInsert(new int[]{1, 3, 5, 6}, 7)));
    }

}
