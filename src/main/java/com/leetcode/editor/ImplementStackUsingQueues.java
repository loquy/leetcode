package com.leetcode.editor;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 *
 * @author loquy
 * @date 2021 /12/16 9:12
 */
public class ImplementStackUsingQueues {

    /**
     * The Queue 1.
     */
    Queue<Integer> queue1;

    /**
     * The Queue 2.
     */
    Queue<Integer> queue2;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ImplementStackUsingQueues implementStackUsingQueues = new ImplementStackUsingQueues();
        implementStackUsingQueues.push(1);
        implementStackUsingQueues.push(2);
        int top = implementStackUsingQueues.top();
        int pop = implementStackUsingQueues.pop();
        boolean empty = implementStackUsingQueues.empty();
        System.out.println(top);
        System.out.println(pop);
        System.out.println(empty);
    }

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     * @param x the x
     */
    public void push(int x) {
        // 队列先进先出，栈是后进先出
        // 添加到队列2，此为栈顶
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            // 如果队列1不为空，循环移除队列1的头部，添加到队列2，此为栈底，
            // 把队列的头尾交换顺序变成栈的顺序
            queue2.offer(queue1.poll());
        }
        // 互换，队列1为队列2的备份
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     * @return the int
     */
    public int pop() {
        return queue1.poll();
    }

    /**
     * Get the top element.
     * @return the int
     */
    public int top() {
        return queue1.peek();
    }

    /**
     * Returns whether the stack is empty.
     * @return the boolean
     */
    public boolean empty() {
        return queue1.isEmpty();
    }
}
