package com.leetcode.editor.string;

/**
 * Excel 表列序号
 *
 * @author loquy
 * @date 2021 /12/14 9:34
 */
public class ExcelSheetColumnNumber {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int aa = titleToNumber("AG");
        System.out.println(aa);
    }

    /**
     * Title to number int.
     *
     * @param columnTitle the column title
     * @return the int
     */
    public static int titleToNumber(String columnTitle) {
        int number = 0;
        int multiple = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            // 1-26（对应 A-Z），从 1 开始，补上 1
            // 26 位字母减字母 A 的差值，字符转整形
            int k = columnTitle.charAt(i) - 'A' + 1;
            // 每个位值：差值乘进位数，加上前一位值等于总值
            number += k * multiple;
            // 转换 26 进制，每进一位乘 26
            multiple *= 26;
        }
        return number;
    }
}
