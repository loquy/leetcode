package com.leetcode.editor;

/**
 * 各位相加
 *
 * @author loquy
 * @date 2021 /12/22 9:14
 */
public class AddDigits {

    private static final int NIGHT = 9;

    private static final int ZERO = 0;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = addDigits(11);
        int i1 = addDigits(22);
        int i2 = addDigits(9);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }

    /**
     * Add digits int.
     *
     * @param num the num
     * @return the int
     */
    public static int addDigits(int num) {
        // 能够被9整除的整数，各位上的数字加起来也必然能被9整除，所以，连续累加起来，最终必然就是9。
        // 不能被9整除的整数，各位上的数字加起来，结果对9取模，和初始数对9取摸，是一样的，所以，连续累加起来，最终必然就是初始数对9取摸。
        if(ZERO < num && ZERO == num % NIGHT)
        {
            return NIGHT;
        }
        return num % NIGHT;
    }
}
