package com.leetcode;

public class Problem141LinkedListCycle {
    public static void main(String[] args) {
        Problem141LinkedListCycle linkedListCycle = new Problem141LinkedListCycle();
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2, new ListNode(0, new ListNode(-4, head)));
        head.next = node1;
        System.out.println(linkedListCycle.hasCycle(head));

    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while((fast != null && fast.next != null) && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
