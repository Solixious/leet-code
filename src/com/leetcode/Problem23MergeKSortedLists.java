package com.leetcode;

public class Problem23MergeKSortedLists {

    public static void main(String[] args) {
        Problem23MergeKSortedLists mergeKSortedLists = new Problem23MergeKSortedLists();
        ListNode listNode1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode3 = new ListNode(2, new ListNode(6));
        ListNode[] listNodes = new ListNode[]{listNode1, listNode2, listNode3};
        ListNode listNode = mergeKSortedLists.mergeKLists(listNodes);
        while(listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode listNodeHead = null;
        ListNode temp = null;
        ListNode min = removeMin(lists);
        if(min != null) {
            listNodeHead = new ListNode();
            temp = listNodeHead;
        }
        while(min != null) {
            temp.val = min.val;
            min = removeMin(lists);
            if(min != null) {
                ListNode node = new ListNode();
                temp.next = node;
                temp = node;
            }
        }
        return listNodeHead;
    }

    private ListNode removeMin(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }

        // Calculate non null min index
        int minIndex = -1;
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null) {
                minIndex = i;
                break;
            }
        }
        if(minIndex == -1) {
            return null;
        }

        for(int i = 1; i < lists.length; i++) {
            if(lists[i] != null && lists[i].val < lists[minIndex].val) {
                minIndex = i;
            }
        }
        ListNode node = new ListNode(lists[minIndex].val);
        lists[minIndex] = lists[minIndex].next;
        return node;
    }
}

