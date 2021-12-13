package com.leetcode.editor;

/**
 * 只出现一次的数字
 *
 * @author loquy
 * @date 2021 /12/13 8:52
 */
public class SingleNumber {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = singleNumber(new int[]{1, 1, 2, 2, 3, 3, 4});
        System.out.println(i);
    }

    /**
     * Single number int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            // ^ 异或，转换二进制操作，相同位为 0，不相同为 1
            // 两个一样的数异或，结果等于 0，一个数与 0 异或，结果等于这个数
            // 可用这点互相抵消相同的数，直到找出那个只出现一次的数
            single ^= num;
        }
        return single;
    }
}
