package com.leetcode.editor.array;

/**
 * 删除有序数组中的重复项
 *
 * @author loquy
 * @date 2022/06/15 10:21
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{2, 2, 3});
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
