package com.leetcode.editor;

import com.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文链表
 *
 * @author loquy
 * @date 2021 /12/17 9:25
 */
public class PalindromeLinkedList {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(ListNode.generate(new int[]{1, 2, 2, 1}));
        System.out.println(palindrome);
    }

    /**
     * Is palindrome boolean.
     *
     * @param head the head
     * @return the boolean
     */
    public static boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();

        // 将链表的值复制到数组中
        ListNode currentNode = head;
        while (currentNode != null) {
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // 使用双指针判断是否回文
        int front = 0;
        int back = values.size() - 1;
        while (front < back) {
            if (!values.get(front).equals(values.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
