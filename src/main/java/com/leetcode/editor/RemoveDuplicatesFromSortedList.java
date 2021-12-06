package com.leetcode.editor;

import com.leetcode.utils.ListNode;

/**
 * 删除排序列表的重复元素
 *
 * @author loquy
 * @date 2021 /12/06 9:15
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListNode head = ListNode.generate(new int[]{1, 2, 3});
        ListNode listNode = deleteDuplicates(head);
        listNode.print();
    }

    /**
     * Delete duplicates list node.
     *
     * @param head the head
     * @return the list node
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode cur = head;
        while (cur.next != null) {
            // 如果当前节点值等于下个节点值
            if (cur.val == cur.next.val) {
                // 则下个节点等于下下个节点
                cur.next = cur.next.next;
            } else {
                // 否则当前节点等于下个节点
                cur = cur.next;
            }
        }

        return head;
    }
}
