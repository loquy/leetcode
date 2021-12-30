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
        // 共计26个字母，每个索引位置对应一个字母
        int[] cnt = new int[26];
        // 循环遍历两个字符串，根据每个索引的值确定出现了几次字母
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            // 出现过得字母，累加对应索引位置的值
            // 字符类型相减会转整型，取得是字母对应的ASCII码
            cnt[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            // 累减出现过得字母，未出现则是0，递减为负数则返回
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }
}

