package com.leetcode.utils;

/**
 * 链表
 *
 * @author loquy
 * @date 2021 /11/18 14:43
 */
public class ListNode {

    /**
     * The Val.
     */
    public int val;

    /**
     * The Next.
     */
    public ListNode next;

    /**
     * Instantiates a new List node.
     */
    public ListNode() {
    }

    /**
     * Instantiates a new List node.
     *
     * @param val the val
     */
    public ListNode(int val) {
        this.val = val;
    }

    /**
     * Instantiates a new List node.
     *
     * @param val  the val
     * @param next the next
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 打印链表所有节点
     */
    public void print(){
        System.out.print(val);
        ListNode temp = this;
        while(temp.next != null) {
            temp = temp.next;
            System.out.print(temp.val);
        }
    }

    /**
     * Generate list node.
     *
     * @param ints the ints
     * @return the list node
     */
    public static ListNode generate(int[] ints) {
        ListNode head = null, tail = null;
        for (int anInt : ints) {
            if (head == null) {
                head = tail = new ListNode(anInt);
            } else {
                tail.next = new ListNode(anInt);
                tail = tail.next;
            }
        }
        return head;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
