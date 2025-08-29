package com.leetcode.util;

/* A binary tree node has data, pointer to left child
   and a pointer to right child */
public class TreeNode {
    public int data;
    public TreeNode left, right;

    TreeNode(int item) {
        data = item;
        left = right = null;
    }
}