package com.leetcode.editor;

import java.util.Arrays;

/**
 * 比特位计数
 *
 * @author loquy
 * @date 2021 /12/28 9:18
 */
public class CountingBits {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] ints = countBits(5);
        System.out.println(Arrays.toString(ints));
    }


    /**
     * Count bits int [ ].
     *
     * @param num the num
     * @return the int [ ]
     */
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                // 奇数：二进制表示中，奇数一定比前面那个偶数多一个 1，因为多的就是最低位的 1。
                //           举例：
                //         0 = 0       1 = 1
                //         2 = 10      3 = 11
                result[i] = result[i - 1] + 1;
            } else {
                // 偶数：二进制表示中，偶数中 1 的个数一定和除以 2 之后的那个数一样多
                //            举例：
                //          2 = 10       4 = 100       8 = 1000
                //          3 = 11       6 = 110       12 = 1100
                result[i] = result[i / 2];
            }
        }
        return result;
    }
}
