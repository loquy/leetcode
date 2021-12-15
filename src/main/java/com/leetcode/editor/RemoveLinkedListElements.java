package com.leetcode.editor;

import com.leetcode.utils.ListNode;

/**
 * 移除链表元素
 *
 * @author loquy
 * @date 2021 /12/15 10:22
 */
public class RemoveLinkedListElements {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListNode generate = ListNode.generate(new int[]{1, 1, 1});
        ListNode listNode = removeElements(generate, 1);
        if (listNode != null) {
            listNode.print();
        } else {
            System.out.println("listNode is null");
        }
    }

    /**
     * Remove elements list node.
     *
     * @param head the head
     * @param val  the val
     * @return the list node
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }
}
