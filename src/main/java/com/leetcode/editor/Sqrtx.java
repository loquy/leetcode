package com.leetcode.editor;

/**
 * 开根号
 *
 * @author loquy
 * @date 2021/12/03 17:10
 */
public class Sqrtx {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = mySqrt(8);
        System.out.println(i);
    }

    /**
     * My sqrt int.
     *
     * @param x the x
     * @return the int
     */
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        // Math.log：返回 double 值的自然对数（以 e 为底），对数是对求幂的逆运算
        // lnx
        double log = Math.log(x);
        // √x = x ^ 1/2 =  1/2 lnx
        double v = 0.5 * log;
        // Math.exp：返回欧拉数 e 的 double 值次方
        // √x = x ^ 1/2 = （e ^ lnx）^ 1/2 = e ^ 1/2 lnx ，使用 e 换底计算开根号
        int ans = (int) Math.exp(v);
        // 浮点数存在误差，需判断 ans + 1 的平方是否小于 x
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }
}
