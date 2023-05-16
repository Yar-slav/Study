package com.example.leetcode.reverseLinkedList;

public class ReverseLinkedList {
    static ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    public static void main(String[] args) {
        System.out.println(reverseLinkedList.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }

}
