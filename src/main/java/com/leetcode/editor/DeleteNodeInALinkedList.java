package com.leetcode.editor;

import com.leetcode.utils.ListNode;

/**
 * 删除链表的节点
 *
 * @author loquy
 * @date 2021 /12/20 15:24
 */
public class DeleteNodeInALinkedList {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListNode generate = ListNode.generate(new int[]{1, 2, 3});
        generate.print();
        deleteNode(generate.next);
        System.out.println();
        generate.print();
    }

    /**
     * Delete node.
     *
     * @param node the node
     */
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
