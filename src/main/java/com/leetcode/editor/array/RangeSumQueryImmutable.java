package com.leetcode.editor.array;

/**
 * 区域和检索 - 数组不可变
 *
 * @author loquy
 * @date 2021 /12/24 14:33
 */
public class RangeSumQueryImmutable {

    private static int[] sums;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        RangeSumQueryImmutable rangeSumQueryImmutable = new RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});
        int i = rangeSumQueryImmutable.sumRange(0, 2);
        int i1 = rangeSumQueryImmutable.sumRange(2, 5);
        int i2 = rangeSumQueryImmutable.sumRange(0, 5);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }

    /**
     * Num array.
     *
     * @param nums the nums
     */
    public RangeSumQueryImmutable(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            // sums 的下一个元素等于 nums 当前元素加 sums 当前元素的和
            // 即 sums 除了第一个元素是 0 ，sums 的下一个元素都是两个数组上一个元素对齐相加的结果
            // sums: [0, -2, -2, 1, -4, -2, -3]
            // nums: [-2, 0, 3, -5, 2, -1]
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    /**
     * Sum range int.
     *
     * @param i the
     * @param j the j
     * @return the int
     */
    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
