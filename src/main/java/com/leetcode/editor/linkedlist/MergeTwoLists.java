package com.leetcode.editor.linkedlist;

import com.leetcode.utils.ListNode;

/**
 * 合并两个有序链表
 *
 * @author loquy
 * @date 2021 /11/29 11:09
 */
class MergeTwoLists {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListNode l1 = ListNode.generate(new int[] {1, 2, 3});
        ListNode l2 = ListNode.generate(new int[] {1, 4, 8});

        ListNode listNode = mergeTwoLists(l1, l2);
        listNode.print();
    }

    /**
     * Merge two lists list node.
     *
     * @param l1 the l 1
     * @param l2 the l 2
     * @return the list node
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            // 递归结束条件
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            // 判断 l1 和 l2 哪个更小，就把这个节点接到下一个
            // 传递较小的节点，不断递归指向下一个节点，直到为空结束
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

