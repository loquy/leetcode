package com.leetcode.editor;

/**
 * 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
 *
 * @author loquy
 * @date 2021 /12/13 15:03
 */
public class ExcelSheetColumnTitle {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(2));
        System.out.println(convertToTitle(3));
        System.out.println(convertToTitle(27));
    }

    /**
     * Convert to title string.
     *
     * @param columnNumber the column number
     * @return the string
     */
    public static String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber > 0) {
            // 10 进制转 26 进制，此位值为余数，但有所不同的是正常转换成 26 进制的余数是0-25，
            // 而本题的余数是 1-26（对应 A-Z），为了消除差距的这个1
            // 让除数减一，那么余数自然就少一，原来余 1 的变成余 0
            int a0 = (columnNumber - 1) % 26;
            // (char)(65) = A，(char)(66) = B...
            // ASCII码，10进制转换
            // 0 + 'A' = 65，1 + 'A' = 66...
            // byte，short，char -->int -->long -->float -->double，隐式转换
            // 先转整形在转字符
            sb.append((char)(a0 + 'A'));
            // 利用除法取下一位数
            columnNumber = (columnNumber - a0) / 26;
        }
        return sb.reverse().toString();
    }
}
