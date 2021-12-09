package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

/**
 * 对称二叉树
 *
 * @author loquy
 * @date 2021 /12/09 10:01
 */
public class SymmetricTree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode treeNode = new TreeNode(3, left, right);

        boolean symmetric = isSymmetric(treeNode);
        System.out.println(symmetric);
    }

    /**
     * Is symmetric boolean.
     *
     * @param root the root
     * @return the boolean
     */
    public static boolean isSymmetric(TreeNode root) {
        // 两颗一样的树比较
        return check(root, root);
    }

    /**
     * Check boolean.
     *
     * @param p the p
     * @param q the q
     * @return the boolean
     */
    public static boolean check(TreeNode p, TreeNode q) {
        // 都为 null 相等，终止返回 true
        if (p == null && q == null) {
            return true;
        }
        // 其中一个不为 null，终止返回 false
        if (p == null || q == null) {
            return false;
        }
        // 根节点值相等且左右子树值相等则是对称的
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
