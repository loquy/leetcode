package com.leetcode.editor;

/**
 * 字符串中的单词数
 *
 * @author loquy
 * @date 2022 /01/14 10:26
 */
public class NumberOfSegmentsInAString {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = countSegments("Hello, my name is John");
        System.out.println(i);
    }

    /**
     * Count segments int.
     *
     * @param s the s
     * @return the int
     */
    public static int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            // 计算字符串中单词的数量，就等同于计数单词的第一个下标的个数。因此，我们只需要遍历整个字符串，统计每个单词的第一个下标的数目即可。
            //
            // 满足单词的第一个下标有以下两个条件：
            //
            // 该下标对应的字符不为空格；
            //
            // 该下标为初始下标或者该下标的前下标对应的字符为空格；
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}
