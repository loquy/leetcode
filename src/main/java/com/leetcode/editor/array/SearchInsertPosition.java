package com.leetcode.editor.array;

/**
 * 搜索插入位置
 *
 * @author loquy
 * @date 2021 /11/29 15:32
 */
public class SearchInsertPosition {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 4}, 2);
        System.out.println(i);
    }

    /**
     * Search insert int.
     *
     * @param nums   the nums
     * @param target the target
     * @return the int
     */
    public static int searchInsert(int[] nums, int target) {
        // 二分查找
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        // 左侧下标小于等于右侧下标则遍历
        while (left <= right) {
            // 中间下标等于左右下标的和除以2加上左侧下标
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                // 记录目标等于中间下标
                ans = mid;
                break;
            } else if (target < nums[mid]) {
                // 小于等于中间下标说明目标在左侧，右侧下标等于中间下标减一，缩小范围到左侧
                right = mid - 1;
                // 记录目标在左侧时的中间下标
                ans = mid;
            }  else if (target > nums[mid]) {
                // 大于于中间下标说明目标在右侧，左侧下标等于中间下标加一，缩小范围到右侧
                left = mid + 1;
                // 在右侧找到则不记录目标在右侧时的中间下标，因为可能左侧下标大于右侧下标，超出数组长度了
            }
        }
        return ans;
    }
}
