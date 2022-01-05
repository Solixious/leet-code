package com.leetcode;


/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class Problem2AddTwoNumbers {

    public static void main(String[] args) {
        Problem2AddTwoNumbers addTwoNumbers = new Problem2AddTwoNumbers();

        // 243
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);

        // 564
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);

        ListNode c = addTwoNumbers.addTwoNumbers(a, b);
        display(c);


        // 0
        a = new ListNode(0);

        // 0
        b = new ListNode(0);

        c = addTwoNumbers.addTwoNumbers(a, b);
        display(c);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode tempResult = result;
        int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val);
        int carry = sum / 10;
        tempResult.val = sum % 10;
        while ((l1 != null && l1.next != null) || (l2 != null && l2.next != null) || carry > 0) {
            tempResult.next = new ListNode();
            tempResult = tempResult.next;

            // Move to next node if available
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            // Add values in both nodes, whichever is available, and carry
            sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            carry = sum / 10;
            tempResult.val = sum % 10;
        }

        return result;
    }

    private static void display(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}