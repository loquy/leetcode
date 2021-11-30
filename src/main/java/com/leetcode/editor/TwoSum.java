package com.leetcode.editor;

import java.util.Arrays;

/**
 * 两数之和
 *
 * @author loquy
 * @date 2021 /11/29 13:33
 */
public class TwoSum {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 2, 3}, 4);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * Two sum int [ ].
     *
     * @param nums   the nums
     * @param target the target
     * @return the int [ ]
     */
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
