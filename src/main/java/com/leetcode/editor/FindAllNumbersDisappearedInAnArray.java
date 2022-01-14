package com.leetcode.editor;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到所有数组中消失的数字
 *
 * @author loquy
 * @date 2022 /01/14 14:57
 */
public class FindAllNumbersDisappearedInAnArray {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<Integer> disappearedNumbers = findDisappearedNumbers(new int[]{1, 2, 1, 1, 1});
        System.out.println(disappearedNumbers);
    }

    /**
     * Find disappeared numbers list.
     *
     * @param nums the nums
     * @return the list
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            // 取模锁定下标
            int x = (num - 1) %  n;
            // 重复下标位置的值累加数组长度
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // 如果大于则是重复的值，否则是数组中缺失的值
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
