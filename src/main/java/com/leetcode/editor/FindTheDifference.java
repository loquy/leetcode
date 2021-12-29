package com.leetcode.editor;

/**
 * 找不同
 *
 * @author loquy
 * @date 2021 /12/29 16:16
 */
public class FindTheDifference {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        char theDifference = findTheDifference("ab", "abc");
        System.out.println(theDifference);
    }

    /**
     * Find the difference char.
     *
     * @param s the s
     * @param t the t
     * @return the char
     */
    public static char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }
}

