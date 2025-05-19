package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * <p>
 * Hint 1:
 */
public class Problem1_2Sum {

    public static int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

}
