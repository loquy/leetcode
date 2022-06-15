package com.leetcode.editor.array;

import java.util.*;

/**
 * 数组交集
 *
 * @author loquy
 * @date 2021 /12/28 11:09
 */
public class IntersectionOfTwoArrays {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] intersection = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        System.out.println(Arrays.toString(intersection));
    }

    /**
     * Intersection int [ ].
     *
     * @param nums1 the nums 1
     * @param nums2 the nums 2
     * @return the int [ ]
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1, set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        list.retainAll(set2);
        set1 = new HashSet<>(list);
        return set1.stream().mapToInt(i -> i).toArray();
    }
}
