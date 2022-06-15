package com.leetcode.editor.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 *
 * @author loquy
 * @date 2021 /11/29 13:36
 */
public class RomanToInt {

    /**
     * The Symbol values.
     */
    static Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int iv = romanToInt("IV");
        int vi = romanToInt("VI");
        System.out.println(iv);
        System.out.println(vi);
    }

    /**
     * Roman to int.t
     *
     * @param s the s
     * @return the int
     */
    public static int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            // 罗马数字中小的数字在大的数字的右边
            // 若存在小的数字在大的数字的左边的情况，根据规则需要减去小的数字
            // IV = I + V = - 1 + 5 = 4
            // VI = V + I = 5 + 1 = 6
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }
}
