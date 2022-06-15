package com.leetcode.editor.math;

/**
 * 3 的幂
 *
 * @author loquy
 * @date 2021 /12/28 8:48
 */
public class PowerOfThree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean powerOfThree = isPowerOfThree(27);
        boolean powerOfThree1 = isPowerOfThree(3);
        System.out.println(powerOfThree);
        System.out.println(powerOfThree1);
    }

    /**
     * Is power of three boolean.
     *
     * @param n the n
     * @return the boolean
     */
    public static boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
