package com.leetcode.editor;

import com.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表
 *
 * @author loquy
 * @date 2021 /12/10 15:52
 */
public class LinkedListCycle {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = listNode;
        boolean balanced = hasCycle(listNode);
        System.out.println(balanced);
    }

    /**
     * Has cycle boolean.
     *
     * @param head the head
     * @return the boolean
     */
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            // 存在的元素添加不进 set 集合，则返回 true
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
