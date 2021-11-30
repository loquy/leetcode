package com.leetcode.editor;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 有效的括号
 *
 * @author loquy
 * @date 2021 /11/29 10:42
 */
public class ValidParentheses {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean valid = isValid(")]");
        System.out.println(valid);
    }

    /**
     * Is valid boolean.
     *
     * @param s the s
     * @return the boolean
     */
    public static boolean isValid(String s) {
        int n = s.length();
        // 不是复数返回false
        if (n % 2 == 1) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                // 遍历右括号情况，栈空或栈顶的左括号不等于当前右括号对应的左括号则返回false
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                // 遇到右括号对应的左括号时出栈
                stack.pop();
            } else {
                // 左括号入栈
                stack.push(ch);
            }
        }
        // 所有遍历完如果是空栈则满足括号闭合，否则不满足
        return stack.isEmpty();
    }
}
