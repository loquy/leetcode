package com.leetcode.editor.math;

/**
 * 2的幂
 *
 * @author loquy
 * @date 2021 /12/16 14:46
 */
public class PowerOfTwo {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean powerOfTwo = isPowerOfTwo(8);
        System.out.println(powerOfTwo);
    }

    /**
     * Is power of two boolean.
     *
     * @param n the n
     * @return the boolean
     */
    public static boolean isPowerOfTwo(int n) {
        // & 按位与的运算规则是将两边的数转换为二进制位，
        // 如果相对应位都是 1，则结果为 1，否则为 0
        // 1 & 1 = 1 , 1 & 0 = 0 , 0 & 1 = 0 , 0 & 0 = 0

        // 一个数 n 是 2 的幂，当且仅当 n 是正整数，并且 n 的二进制表示中仅包含 1 个 1
        // 将 n 的二进制表示中最低位的那个 1 提取出来，再判断剩余的数值是否为 0 即可
        return n > 0 && (n & (n - 1)) == 0;
    }
}
