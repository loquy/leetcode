package com.leetcode.editor;

/**
 * 二进制求和
 *
 * @author loquy
 * @date 2021 /12/01 9:57
 */
public class AddBinary {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String s = addBinary("11", "1");
        System.out.println(s);
    }

    /**
     * Add binary string.
     *
     * @param a the a
     * @param b the b
     * @return the string
     */
    public static String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        // 列竖式逢二进一
        int n = Math.max(a.length(), b.length()), carry = 0;
        int aLength = a.length();
        int bLength = b.length();
        // 先表达式后递增，下标从 0 开始
        for (int i = 0; i < n; ++i) {
            // 取当前位数, -'0' ：char 转 int；当前位数大于等于字符长度则补零对齐两个数
            int ia = i < aLength ? a.charAt(aLength - 1 - i) - '0' : 0;
            int ib = i < bLength ? b.charAt(bLength - 1 - i) - '0' : 0;
            // 进位数 = 前一个进位数 + a 当前位数 + b 当前位数
            carry = carry + ia + ib;
            // 当前位对齐相加的结果为：进位数除2的余数
            ans.append((char) (carry % 2 + '0'));
            // 进位数整除 2 则进 1，否则不进位为 0
            carry /= 2;
        }

        // 最后一个进位数大于0则进一位
        if (carry > 0) {
            ans.append('1');
        }

        // 从数的尾部开始逐个位置相加，需要反转下
        ans.reverse();

        return ans.toString();
    }
}
