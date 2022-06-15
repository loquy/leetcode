package com.leetcode.editor.linkedlist;

import com.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 相交链表
 *
 * @author loquy
 * @date 2021 /12/13 10:51
 */
public class IntersectionOfTwoLinkedLists {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = new ListNode(3);
        l2.next = l1.next;
        ListNode intersectionNode = getIntersectionNode(l1, l2);
        if (intersectionNode == null) {
            throw new AssertionError("intersectionNode is null");
        } else {
            intersectionNode.print();
        }
    }

    /**
     * Gets intersection node.
     *
     * @param headA the head a
     * @param headB the head b
     * @return the intersection node
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        // 遍历链表A，每个节点依次加入哈希集合
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        // 遍历链表B，判断节点是否在哈希集合里
        // 存在则是相加节点，后面节点在哈希集合里
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
