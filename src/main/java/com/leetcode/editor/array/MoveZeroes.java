package com.leetcode.editor.array;

import java.util.Arrays;

/**
 * 移动零
 *
 * @author loquy
 * @date 2021 /12/24 14:08
 */
public class MoveZeroes {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 3, 12};
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * Move zeroes.
     *
     * @param nums the nums
     */
    public static void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                // 非零元素，左右指针的元素互换，同时左指针右移。
                // 否则右指针右移。
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    /**
     * Swap.
     *
     * @param nums  the nums
     * @param left  the left
     * @param right the right
     */
    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
