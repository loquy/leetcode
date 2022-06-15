package com.leetcode.editor.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 *
 * @author loquy
 * @date 2021 /12/10 10:23
 */
public class PascalsTriangle {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<List<Integer>> generate = generate(10);
        for (List<Integer> integers : generate) {
            System.out.println(integers);
        }
    }

    /**
     * Generate list.
     *
     * @param numRows the num rows
     * @return the list
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        // 循环层数，先表达式后递增
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            // 每层的个数小于等于层数
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    // 每层的首位和末尾数为1
                    row.add(1);
                } else {
                    // 除此之外，每个数是它左上方和右上方的数的和
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
