package com.leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/plus-one/
 * <p>
 * Hint 1:
 */
public class Problem66_PlusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }

}
