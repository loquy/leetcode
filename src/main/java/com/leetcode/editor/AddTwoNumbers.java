package com.leetcode.editor;

import com.leetcode.utils.ListNode;

/**
 * 两数相加
 *
 * @author loquy
 * @date 2021 /11/18 11:15
 */
public class AddTwoNumbers {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListNode l1 = ListNode.generate(new int[] {9, 9, 9});
        ListNode l2 = ListNode.generate(new int[] {9, 9, 9, 9, 9, 9, 9, 9, 9});

        ListNode listNode = addTwoNumbers(l1, l2);
        listNode.print();
    }

    /**
     * Add two numbers list node.
     *
     * @param l1 the l 1
     * @param l2 the l 2
     * @return the list node
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            // 如果结点空补零，两个链表结点数保持相同，逐个位置相加
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            // 逐个位置相加，大于十补上进位
            int sum = n1 + n2 + carry;
            if (head == null) {
                // 头节点指向下一个节点引用, 相加结果大于10则下一位加1，此位值为余数，竖式相加
                head = tail = new ListNode(sum % 10);
            } else {// 循环替换下一个结点，相加结果取余数
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            // 十进制相加，进位，小于10取0.几的整数
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            // 最后一位相加的大于10，则尾部补上进位值
            tail.next = new ListNode(carry);
        }
        // 就此两数相加结果数，只不过顺序相反，因为是从数的尾部开始逐个位置相加
        return head;
    }
}
