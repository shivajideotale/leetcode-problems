package com.leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/description/
 * <p>
 * Hint 1: So, we essentially need to find three numbers x, y, and z such that they add up to the given value. If we fix one of the numbers say x, we are left with the two-sum problem at hand!
 */
public class Problem39_CombinationSum {

    private static final List<List<Integer>> RESULT = new LinkedList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {


        return null;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

}
