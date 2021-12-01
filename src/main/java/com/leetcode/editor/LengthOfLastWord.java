package com.leetcode.editor;

/**
 * 最后一个单词的长度
 *
 * @author loquy
 * @date 2021/11/30 13:45
 */
class LengthOfLastWord {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = lengthOfLastWord(" abc test");
        System.out.println(i);
    }

    /**
     * Length of last word int.
     *
     * @param s the s
     * @return the int
     */
    public static int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        // 反向遍历，遇到空格则递减到单词尾部
        while (s.charAt(index) == ' ') {
            index--;
        }
        int wordLength = 0;
        // 单词尾部开始递增，递减遇到空格则到了单词头部结束递增
        while (index >= 0 && s.charAt(index) != ' ') {
            wordLength++;
            index--;
        }
        return wordLength;
    }
}

