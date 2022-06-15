package com.leetcode.editor.stack;

import java.util.Stack;

/**
 * 最小栈
 *
 * @author loquy
 * @date 2021 /12/13 9:06
 */
public class MinStack {

    /**
     * 栈
     */
    private final Stack<Integer> stack;

    /**
     * 辅助栈存取最小值
     */
    private final Stack<Integer> minStack;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();
        minStack.pop();
        int top = minStack.top();
        int min1 = minStack.getMin();
        int top1 = minStack.top();
        System.out.println(min);
        System.out.println(top);
        System.out.println(min1);
        System.out.println(top1);
    }

    /**
     * Instantiates a new Min stack.
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    /**
     * Push.
     *
     * @param x the x
     */
    public void push(int x) {
        stack.push(x);
        // 每当 push() 新值进来时，
        // 如果 小于等于 minStack 栈顶值，
        // 则一起 push() 到 minStack ，即更新了栈顶最小值
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    /**
     * Pop.
     */
    public void pop() {
        // 判断将 pop() 出去的元素值是否是minStack栈顶元素值（即最小值），
        // 如果是则将 minStack 栈顶元素一起 pop()，
        // 这样可以保证 minStack 栈顶元素始终是 stack 中的最小值
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    /**
     * Top int.
     *
     * @return the int
     */
    public int top() {
        return stack.peek();
    }

    /**
     * Gets min.
     *
     * @return the min
     */
    public int getMin() {
        // 返回 minStack 栈顶即可
        return minStack.peek();
    }
}
