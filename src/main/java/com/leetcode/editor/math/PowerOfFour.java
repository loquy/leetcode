package com.leetcode.editor.math;

/**
 * 4 的幂
 *
 * @author loquy
 * @date 2021 /12/28 8:57
 */
public class PowerOfFour {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean powerOfFour = isPowerOfFour(4);
        boolean powerOfFour1 = isPowerOfFour(16);
        System.out.println(powerOfFour);
        System.out.println(powerOfFour1);
    }

    /**
     * Is power of four boolean.
     *
     * @param n the n
     * @return the boolean
     */
    public static boolean isPowerOfFour(int n) {
        while(n != 0 && n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}
