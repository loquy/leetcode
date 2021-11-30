package com.leetcode.editor;

/**
 * 整数反转
 *
 * @author loquy
 * @date 2021 /11/29 13:35
 */
public class Reverse {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int reverse = reverse(123);
        System.out.println(reverse);
    }

    /**
     * Reverse int.
     *
     * @param x the x
     * @return the int
     */
    public static int reverse(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }
}
