package com.leetcode.editor;

import java.util.Arrays;

/**
 * 丢失的数字
 *
 * @author loquy
 * @date 2021 /12/24 13:59
 */
public class MissingNumber {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = missingNumber(new int[]{1, 2, 3});
        int i1 = missingNumber(new int[]{0, 1, 3});
        int i2 = missingNumber(new int[]{0, 0, 0});
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }

    /**
     * Missing number int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}
