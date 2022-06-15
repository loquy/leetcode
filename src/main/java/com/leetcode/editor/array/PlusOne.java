package com.leetcode.editor.array;

import java.util.Arrays;

/**
 * 加一
 *
 * @author loquy
 * @date 2021/12/01 9:36
 */
public class PlusOne {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{1, 2, 3});
        int[] ints1 = plusOne(new int[]{1, 2, 9});
        int[] ints2 = plusOne(new int[]{1, 9, 9});
        int[] ints3 = plusOne(new int[]{9, 9, 9});
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(ints3));
    }

    /**
     * Plus one int [ ].
     *
     * @param digits the digits
     * @return the int [ ]
     */
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        // 末位数向前遍历
        for (int i = n - 1; i >= 0; --i) {
            // 等于9跳过遍历
            if (digits[i] != 9) {
                // 不等于9当前位数加一
                ++digits[i];
                // 当前位数后一位如果小于最后一位，遍历跳过的位数赋值0
                for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
