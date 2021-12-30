package com.leetcode.editor;

/**
 * 判断子序列
 *
 * @author loquy
 * @date 2021 /12/30 10:06
 */
public class IsSubsequence {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean subsequence = isSubsequence("abc", "ahbgdc");
        boolean subsequence1 = isSubsequence("axc", "ahbgdc");
        System.out.println(subsequence);
        System.out.println(subsequence1);
    }

    /**
     * Is subsequence boolean.
     *
     * @param s the s
     * @param t the t
     * @return the boolean
     */
    public static boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        // 我们初始化两个指针 i 和 j，分别指向 s 和 t 的初始位置。
        int i = 0, j = 0;
        while (i < n && j < m) {
            // 每次贪心地匹配，匹配成功则 i 和 j 同时右移，
            // 匹配 s 的下一个位置，匹配失败则 j 右移，i 不变，尝试用 t 的下一个字符匹配 s。
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        // 最终如果 i 移动到 s 的末尾，就说明 s 是 t 的子序列。
        return i == n;
    }
}
