package com.github.mathan26.leetcode.challenges.april;


public class CnsrtBTreeFromPreOrder {
    public static void main(String[] args) {
        CnsrtBTreeFromPreOrder cnsrtBTreeFromPreOrder = new CnsrtBTreeFromPreOrder();
        int[] preorder = {8, 5, 1, 7, 10, 12};
        cnsrtBTreeFromPreOrder.bstFromPreorder(preorder);
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int start, int end) {
        if (start > end) return null;

        TreeNode node = new TreeNode(preorder[start]);
        int i;
        for (i = start; i <= end; i++) {
            if (preorder[i] > node.val)
                break;
        }

        node.left = helper(preorder, start + 1, i - 1);
        node.right = helper(preorder, i, end);
        return node;
    }
}
