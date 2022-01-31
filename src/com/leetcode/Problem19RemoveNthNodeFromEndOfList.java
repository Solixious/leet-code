package com.leetcode;

public class Problem19RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        Problem19RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new Problem19RemoveNthNodeFromEndOfList();
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5)))));
        int n = 2;
        node = removeNthNodeFromEndOfList.removeNthFromEnd(node, n);
        while(node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ahead = head;
        ListNode behind = head;
        for(int i = 0; i < n; i++) {
            ahead = ahead.next;
        }

        if(ahead == null) {
            return behind.next;
        }

        while(ahead.next != null) {
            ahead = ahead.next;
            behind = behind.next;
        }
        behind.next = behind.next.next;
        return head;
    }
}
