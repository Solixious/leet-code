package com.leetcode;

public class Problem21MergeTwoSortedLists {
    public static void main(String[] args) {
        Problem21MergeTwoSortedLists mergeTwoSortedLists = new Problem21MergeTwoSortedLists();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode merged = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        while(merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while(list1 != null || list2 != null) {
            current.next = new ListNode();
            current = current.next;
            if((list1 != null && list2 == null) || (list1 != null && list2 != null && list1.val <= list2.val)) {
                current.val = list1.val;
                list1 = list1.next;
            } else if((list1 == null && list2 != null) || (list1 != null && list2 != null && list1.val > list2.val)){
                current.val = list2.val;
                list2 = list2.next;
            }
        }
        return head.next;
    }
}
