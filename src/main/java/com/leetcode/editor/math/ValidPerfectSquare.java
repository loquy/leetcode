package com.leetcode.editor.math;

/**
 * 有效的完全平方数
 *
 * @author loquy
 * @date 2021 /12/29 9:22
 */
public class ValidPerfectSquare {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean perfectSquare = isPerfectSquare(16);
        System.out.println(perfectSquare);
    }

    /**
     * Is perfect square boolean.
     *
     * @param num the num
     * @return the boolean
     */
    public static boolean isPerfectSquare(int num)
    {
        // 14=1+3 9=1+3+5 16=1+3+5+7 以此类推，
        // 模仿它可以使用一个while循环，
        // 不断减去一个从1开始不断增大的奇数，
        // 若最终减成了0，说明是完全平方数，否则，不是。
        int num1 = 1;
        while(num > 0)
        {
            num -= num1;
            num1 += 2;
        }
        return num == 0;
    }
}
