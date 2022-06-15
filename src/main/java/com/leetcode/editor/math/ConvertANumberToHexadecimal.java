package com.leetcode.editor.math;

/**
 * 数字转换为十六进制数
 *
 * @author loquy
 * @date 2021 /12/31 9:40
 */
public class ConvertANumberToHexadecimal {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String s = toHex(1);
        String s1 = toHex(10);
        String s2 = toHex(100);
        String s3 = toHex(1000);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    /**
     * To hex string.
     *
     * @param num the num
     * @return the string
     */
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 7; i >= 0; i--) {
            int val = (num >> (4 * i)) & 0xf;
            if (sb.length() > 0 || val > 0) {
                char digit = val < 10 ? (char) ('0' + val) : (char) ('a' + val - 10);
                sb.append(digit);
            }
        }
        return sb.toString();
    }
}
