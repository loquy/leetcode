package com.leetcode.editor.linkedlist;

import com.leetcode.utils.ListNode;

/**
 * 反转链表
 *
 * @author loquy
 * @date 2021/12/15 15:20
 */
public class ReverseLinkedList {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListNode generate = ListNode.generate(new int[]{1, 2, 3});
        ListNode listNode = reverseList(generate);
        listNode.print();
    }

    /**
     * Reverse list list node.
     *
     * @param head the head
     * @return the list node
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
