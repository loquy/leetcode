package com.leetcode.editor;

/**
 * 回文数
 *
 * @author loquy
 * @date 2021 /11/29 13:36
 */
public class IsPalindrome {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(131);
        System.out.println(palindrome);
    }

    /**
     * Is palindrome boolean.
     *
     * @param x the x
     * @return the boolean
     */
    public static boolean isPalindrome(int x) {
        // 负数去除，除10的余数等于0去除（0除外）
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // 逆转数字
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 如果逆转等于正传即使回文
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
