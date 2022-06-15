package com.leetcode.editor.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 *
 * @author loquy
 * @date 2021 /12/29 10:25
 */
public class FirstUniqueCharacterInAString {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int leetcode = firstUniqChar("leetcode");
        int loveleetcode = firstUniqChar("loveleetcode");
        System.out.println(leetcode);
        System.out.println(loveleetcode);
    }

    /**
     * First uniq char int.
     *
     * @param s the s
     * @return the int
     */
    public static int firstUniqChar(String s) {
        // 我们可以对字符串进行两次遍历。
        // 在第一次遍历时，我们使用哈希映射统计出字符串中每个字符出现的次数。
        // 在第二次遍历时，我们只要遍历到了一个只出现一次的字符，那么就返回它的索引，
        // 否则在遍历结束后返回 -1。
        Map<Character, Integer> frequency = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
