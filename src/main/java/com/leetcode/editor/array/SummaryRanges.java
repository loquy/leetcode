package com.leetcode.editor.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 汇总区间
 *
 * @author loquy
 * @date 2021 /12/16 14:05
 */
public class SummaryRanges {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<String> strings = summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        System.out.println(strings);
    }

    /**
     * Summary ranges list.
     *
     * @param nums the nums
     * @return the list
     */
    public static List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            // 每次遇到相邻元素之间的差值大于 1 时，我们就找到了一个区间
            // [i] 位置 和 [i - 1] + 1 位置的值不相等则大于1
            while (i < n && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuilder temp = new StringBuilder(Integer.toString(nums[low]));
            if (low < high) {
                temp.append("->");
                temp.append(nums[high]);
            }
            ret.add(temp.toString());
        }
        return ret;
    }
}
