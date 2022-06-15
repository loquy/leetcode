package com.leetcode.editor.string;

/**
 * 实现 strStr()
 *
 * @author loquy
 * @date 2022/06/15 10:23
 */
public class ImplementStrstr {

    public static void main(String[] args) {
        int i = strStr("need", "d");
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i + m <= n; i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
