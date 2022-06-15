package com.leetcode.editor.array;

/**
 * 最大子数组和
 *
 * @author loquy
 * @date 2021 /11/30 11:25
 */
public class MaximumSubarray {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = maxSubArray(new int[]{1, 2, 3, 4});
        System.out.println(i);
    }

    /**
     * Max sub array int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            // 相邻两个值的和与当前值哪个更大
            pre = Math.max(pre + x, x);
            // 与前一个最大和相比哪个更大
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
