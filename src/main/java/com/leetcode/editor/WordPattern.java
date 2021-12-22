package com.leetcode.editor;

import java.util.HashMap;
import java.util.Map;

/**
 * 单词规律
 *
 * @author loquy
 * @date 2021 /12/22 10:36
 */
public class WordPattern {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean b = wordPattern("abba", "dog cat cat dog");
        boolean b1 = wordPattern("abab", "dog cat dog cat");
        boolean b2 = wordPattern("abcc", "dog cat dog dog");
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
    }

    /**
     * Word pattern boolean.
     *
     * @param pattern the pattern
     * @param str     the str
     * @return the boolean
     */
    public static boolean wordPattern(String pattern, String str) {
        int len = pattern.length();
        Map<String, Character> str2ch = new HashMap<>(len);
        Map<Character, String> ch2str = new HashMap<>(len);
        int m = str.length();
        int i = 0;
        for (int p = 0; p < pattern.length(); ++p) {
            char ch = pattern.charAt(p);
            if (i >= m) {
                return false;
            }
            int j = i;
            while (j < m && str.charAt(j) != ' ') {
                j++;
            }
            String tmp = str.substring(i, j);
            if (str2ch.containsKey(tmp) && str2ch.get(tmp) != ch) {
                return false;
            }
            if (ch2str.containsKey(ch) && !tmp.equals(ch2str.get(ch))) {
                return false;
            }
            str2ch.put(tmp, ch);
            ch2str.put(ch, tmp);
            i = j + 1;
        }
        return i >= m;
    }
}
