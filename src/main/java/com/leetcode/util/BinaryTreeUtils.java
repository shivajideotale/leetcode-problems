package com.leetcode.util;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUtils {

    public static TreeNode constructTree(Integer[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0 || levelOrder[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(levelOrder[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < levelOrder.length) {
            TreeNode current = queue.poll();

            // Left child
            if (levelOrder[i] != null) {
                current.left = new TreeNode(levelOrder[i]);
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < levelOrder.length && levelOrder[i] != null) {
                current.right = new TreeNode(levelOrder[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    // Example usage (inorder traversal for verification)
    public static void inorderTraversal(TreeNode node, StringBuilder sb) {
        if (node == null) {
            //sb.append("null ");
            return;
        }
        inorderTraversal(node.left, sb);
        sb.append(node.data).append(" ");
        inorderTraversal(node.right, sb);
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {1, 2, 3, null, 4, 5, null}; // Example level order with nulls
        TreeNode root = constructTree(levelOrder);
        System.out.print("Inorder Traversal of constructed tree: ");
        StringBuilder sb = new StringBuilder();
        inorderTraversal(root, sb); // Expected: 2 4 1 5 3
        System.out.println(sb);
    }
}
