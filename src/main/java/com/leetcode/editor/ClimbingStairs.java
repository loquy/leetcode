package com.leetcode.editor;

/**
 * 爬楼梯
 *
 * @author loquy
 * @date 2021 /12/03 17:14
 */
public class ClimbingStairs {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = climbStairs(8);
        System.out.println(i);
    }

    /**
     * Climb stairs int.
     *
     * @param n the n
     * @return the int
     */
    public static int climbStairs(int n) {
        int p, q = 0, r = 1;
        // 斐波那契数列指的是这样一个数列：
        // 这个数列从第3项开始，每一项都等于前两项之和。
        // a(n) = a(n-1) + a(n-2)
        for (int i = 1; i <= n; ++i) {
            // 前前个累加
            p = q;
            // 前个累加
            q = r;
            // 当前累加 = 前前个累加 + 前个累加
            r = p + q;
        }
        return r;
    }
}
