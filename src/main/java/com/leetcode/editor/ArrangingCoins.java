package com.leetcode.editor;

/**
 * 排列硬币
 *
 * @author loquy
 * @date 2022 /01/14 10:36
 */
public class ArrangingCoins {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = arrangeCoins(11);
        System.out.println(i);
    }

    /**
     * Arrange coins int.
     *
     * @param n the n
     * @return the int
     */
    public static int arrangeCoins(int n) {
        int left = 1, right = n;
        while (left < right) {
            // 二分法
            int mid = (right - left + 1) / 2 + left;
            // 等差数列 a(n) = k * (k + 1) / 2
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
