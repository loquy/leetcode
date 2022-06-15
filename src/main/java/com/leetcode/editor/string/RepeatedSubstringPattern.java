package com.leetcode.editor.string;

/**
 * 重复的子字符串
 *
 * @author loquy
 * @date 2022 /01/14 10:48
 */
public class RepeatedSubstringPattern {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean abab = repeatedSubstringPattern("abab");
        boolean ababc = repeatedSubstringPattern("ababc");
        System.out.println(abab);
        System.out.println(ababc);
    }

    /**
     * Repeated substring pattern boolean.
     *
     * @param s the s
     * @return the boolean
     */
    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        // 在 n / 2 范围内枚举，n 不会大于 i 的一半
        for (int i = 1; i * 2 <= n; ++i) {
            // 整除则进入，n 与 i 必须为倍数关系才能满足字串
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    // j = j -1
                    char c = s.charAt(j);
                    char c1 = s.charAt(j - i);
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}
