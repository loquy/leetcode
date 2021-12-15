package com.leetcode.editor;

import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 *
 * @author loquy
 * @version 1.0
 * @date 2021 /12/15 10:47
 */
public class IsomorphicStrings {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean isomorphic = isIsomorphic("egg", "add");
        System.out.println(isomorphic);
    }

    /**
     * Is isomorphic boolean.
     *
     * @param s the s
     * @param t the t
     * @return the boolean
     */
    public static boolean isIsomorphic(String s, String t) {
        int len = s.length();
        Map<Character, Character> s2t = new HashMap<>(len);
        Map<Character, Character> t2s = new HashMap<>(len);
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            // egg 和 add 同构，就意味着下边的映射成立
            //e -> a
            //g -> d
            //也就是将 egg 的 e 换成 a, g 换成 d, 就变成了 add
            //
            //同时倒过来也成立
            //a -> e
            //d -> g
            //也就是将 add 的 a 换成 e, d 换成 g, 就变成了 egg
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
}
