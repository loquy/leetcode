package com.leetcode.editor.math;

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
        boolean palindrome2 = isPalindrome(999);
        System.out.println(palindrome);
        System.out.println(palindrome2);
    }

    /**
     * Is palindrome boolean.
     *
     * @param x the x
     * @return the boolean
     */
    public static boolean isPalindrome(int x) {
        // 去除负数和除10的余数等于0的数（0除外）
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // 逆转数字
        int revertedNumber = 0;
        while (x > revertedNumber) {
            // 每次除10取余，利用余数取从末尾开始逆转，同时乘以10进一位
            revertedNumber = revertedNumber * 10 + x % 10;
            // 每次除10取整退一位
            x /= 10;
        }

        // 如果逆转等于正转则是回文，或除10等于自己只能是0为回文
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
