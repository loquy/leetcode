package com.leetcode.editor;

/**
 * 最长公共前缀
 *
 * @author loquy
 * @date 2021 /11/29 9:30
 */
public class LongestCommonPrefix {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(strings);
        System.out.println(s);
    }

    /**
     * Longest common prefix string.
     *
     * @param strs the strs
     * @return the string
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;

        // 遍历字符串数组所有值
        for (int i = 1; i < count; i++) {
            // 从第1个字符串开始与后一位字符串对比
            prefix = longestCommonPrefix(prefix, strs[i]);
            int length = prefix.length();
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    /**
     * Longest common prefix string.
     *
     * @param str1 the str 1
     * @param str2 the str 2
     * @return the string
     */
    public static String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        // 遍历次数为两个数组长度最小一位的长度，且两个字符串每一位相同则累加子串结束索引
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        // 返回相同部分的子字符串
        return str1.substring(0, index);
    }
}
