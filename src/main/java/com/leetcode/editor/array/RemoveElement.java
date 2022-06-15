package com.leetcode.editor.array;

/**
 * 移除元素
 *
 * @author loquy
 * @date 2022/06/15 10:21
 */
public class RemoveElement {

    public static void main(String[] args) {
        int i = removeElement(new int[]{1, 2, 3}, 1);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
