package com.leetcode.editor.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 用栈实现队列
 *
 * @author loquy
 * @date 2021 /12/16 15:19
 */
public class ImplementQueueUsingStacks {

    /**
     * The In stack.
     */
    Deque<Integer> inStack;

    /**
     * The Out stack.
     */
    Deque<Integer> outStack;

    /**
     * Instantiates a new Implement queue using stacks.
     */
    public ImplementQueueUsingStacks() {
        inStack = new LinkedList<>();
        outStack = new LinkedList<>();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ImplementQueueUsingStacks implementQueueUsingStacks = new ImplementQueueUsingStacks();
        implementQueueUsingStacks.push(1);
        implementQueueUsingStacks.push(2);
        int peek = implementQueueUsingStacks.peek();
        int pop = implementQueueUsingStacks.pop();
        boolean empty = implementQueueUsingStacks.empty();
        System.out.println(peek);
        System.out.println(pop);
        System.out.println(empty);
    }

    /**
     * Push.
     *
     * @param x the x
     */
    public void push(int x) {
        inStack.push(x);
    }

    /**
     * Pop int.
     *
     * @return the int
     */
    public int pop() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    /**
     * Peek int.
     *
     * @return the int
     */
    public int peek() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    /**
     * Empty boolean.
     *
     * @return the boolean
     */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    /**
     * in2out
     */
    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
