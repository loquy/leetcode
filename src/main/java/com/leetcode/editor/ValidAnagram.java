package com.leetcode.editor;

import java.util.Arrays;

/**
 * 有效的字母异位词
 *
 * @author loquy
 * @date 2021 /12/20 15:31
 */
public class ValidAnagram {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean anagram = isAnagram("rat", "car");
        boolean anagram1 = isAnagram("anagram", "nagaram");
        System.out.println(anagram);
        System.out.println(anagram1);
    }

    /**
     * Is anagram boolean.
     *
     * @param s the s
     * @param t the t
     * @return the boolean
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
