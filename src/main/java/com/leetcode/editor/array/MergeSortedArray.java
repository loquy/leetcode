package com.leetcode.editor.array;

import java.util.Arrays;

/**
 * 合并两个有序数组
 *
 * @author loquy
 * @date 2021 /12/06 9:36
 */
public class MergeSortedArray {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // ints.length = m + n
        int[] ints = {1, 2, 3, 4, 5, 6};
        int[] ints1 = {7, 8, 9};
        merge(ints, 3, ints1, 3);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * Merge.
     *
     * @param nums1 the nums 1
     * @param m     the m
     * @param nums2 the nums 2
     * @param n     the n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            // 替换 nums1 数组 m 长度后的值
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
