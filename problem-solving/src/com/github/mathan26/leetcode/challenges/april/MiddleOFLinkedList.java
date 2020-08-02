package com.github.mathan26.leetcode.challenges.april;



   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MiddleOFLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode hare=head,tortoise=head;

        while(hare!=null && hare.next!=null){
            tortoise=tortoise.next;
            hare=hare.next.next;
        }

        return tortoise;
    }
}
