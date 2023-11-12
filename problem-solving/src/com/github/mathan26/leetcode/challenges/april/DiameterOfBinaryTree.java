package com.github.mathan26.leetcode.challenges.april;


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int rDiameter = diameterOfBinaryTree(root.right);
        int lDiameter = diameterOfBinaryTree(root.left);

        int result = Math.max((leftHeight + rightHeight), Math.max(rDiameter, lDiameter));
        return result;
    }

    public int height(TreeNode node) {
        if (node == null)
            return 0;
        int left = height(node.left);
        int right = height(node.right);
        if (left > right) {
            return 1 + left;
        } else {
            return 1 + right;
        }
    }
}
