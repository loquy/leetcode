package com.leetcode.editor.math;

import java.util.HashSet;
import java.util.Set;

/**
 * 快乐数
 *
 * @author loquy
 * @date 2021 /12/15 9:50
 */
public class HappyNumber {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean happy = isHappy(19);
        System.out.println(happy);
    }

    /**
     * Get next int.
     *
     * @param n
     * @return int
     */
    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            // 余数为此位
            int d = n % 10;
            // 下一位数
            n = n / 10;
            // 每位平方累加
            totalSum += d * d;
        }
        return totalSum;
    }

    /**
     * Is happy boolean.
     *
     * @param n the n
     * @return the boolean
     */
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            // 添加不重复的元素
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
