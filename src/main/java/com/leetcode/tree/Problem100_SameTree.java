package com.leetcode.tree;

import com.leetcode.util.BinaryTreeUtils;
import com.leetcode.util.TreeNode;

/**
 * https://leetcode.com/problems/same-tree/description/
 */
public class Problem100_SameTree {
    public static void main(String[] args) {

        TreeNode p = BinaryTreeUtils.constructTree(new Integer[]{1, 2, 3, 5});
        TreeNode q = BinaryTreeUtils.constructTree(new Integer[]{1, 2, 3, 5});

        System.out.println(isSameTree(p, q));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if ((p != null && q != null) && (p.data == q.data)) {
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        } else {
            return false;
        }
    }
}
