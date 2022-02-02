package com.leetcode;

public class Problem203RemoveLinkedListElements {

    public static void main(String[] args) {
        Problem203RemoveLinkedListElements removeLinkedListElements = new Problem203RemoveLinkedListElements();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode current = removeLinkedListElements.removeElements(head, 6);
        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        // Remove at beginning
        while(head != null && head.val == val) {
            head = head.next;
        }
        // Remove rest
        ListNode current = head;
        while(current != null) {
            if(current.next != null && current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
