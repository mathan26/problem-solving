package com.github.mathan26.July.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;

        LinkedList<TreeNode> current = new LinkedList<>();
        LinkedList<TreeNode> next = new LinkedList<>();
        current.offer(root);

        ArrayList<Integer> numberList = new ArrayList<>();

        while(!current.isEmpty()){
            TreeNode head = current.poll();
            numberList.add(head.val);

            if(head.left!=null)
                next.offer(head.left);
            if(head.right!=null)
                next.offer(head.right);

            if(current.isEmpty()){
                current=next;
                next=new LinkedList<TreeNode>();
                result.add(numberList);
                numberList = new ArrayList<>();
            }
        }
        List<List<Integer>> reversedResult = new ArrayList<>();
        for(int i=result.size()-1; i>=0; i--){
            reversedResult.add(result.get(i));
        }

        return reversedResult;


    }
}
