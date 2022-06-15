package com.leetcode.editor.string;

/**
 * 反转字符串
 *
 * @author loquy
 * @date 2021 /12/28 10:07
 */
public class ReverseString {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(chars);
        reverseString(chars);
        System.out.println(chars);
    }

    /**
     * Reverse string.
     *
     * @param s the s
     */
    public static void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int i1 = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            temp[i1] = s[i];
            i1++;
        }
        System.arraycopy(temp, 0, s, 0, s.length);
    }
}
