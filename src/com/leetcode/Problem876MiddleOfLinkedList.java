package com.leetcode;

public class Problem876MiddleOfLinkedList {

    public static void main(String[] args) {
        Problem876MiddleOfLinkedList middleOfLinkedList = new Problem876MiddleOfLinkedList();
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5, new ListNode(6))))));
        ListNode middleNode = middleOfLinkedList.middleNode(node);
        System.out.println(middleNode.val);
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
