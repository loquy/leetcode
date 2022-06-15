package com.leetcode.editor.math;

/**
 * 丑数
 *
 * @author loquy
 * @date 2021 /12/22 9:24
 */
public class UglyNumber {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean ugly = isUgly(6);
        boolean ugly1 = isUgly(7);
        System.out.println(ugly);
        System.out.println(ugly1);
    }

    /**
     * Is ugly boolean.
     *
     * @param n the n
     * @return the boolean
     */
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
