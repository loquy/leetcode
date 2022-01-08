package com.leetcode.editor;

/**
 * 最长回文串
 *
 * @author loquy
 * @date 2022 /01/07 13:37
 */
public class LongestPalindrome {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int abccccdd = longestPalindrome("abccccdd");
        System.out.println(abccccdd);
    }

    /**
     * Longest palindrome int.
     *
     * @param s the s
     * @return the int
     */
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

}
