package com.leetcode.editor;

/**
 * 验证回文串
 *
 * @author loquy
 * @date 2021 /12/10 15:37
 */
public class ValidPalindrome {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }

    /**
     * Is palindrome boolean.
     *
     * @param s the s
     * @return the boolean
     */
    public static boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            // 判断是不是字母或数字
            if (Character.isLetterOrDigit(ch)) {
                // 大写转小写附加到字符串序列
                sgood.append(Character.toLowerCase(ch));
            }
        }
        // 反向替换字符串序列
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();

        return sgood.toString().equals(sgood_rev.toString());
    }

}
