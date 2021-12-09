package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

/**
 * 平衡的二叉树
 * 一个二叉树每个节点 的左右两个子树高度差的绝对值不超过 1 。
 *
 * @author loquy
 * @date 2021 /12/09 16:39
 */
public class BalancedBinaryTree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3, left, right);
        boolean balanced = isBalanced(treeNode);
        System.out.println(balanced);
    }

    /**
     * Is balanced boolean.
     *
     * @param root the root
     * @return the boolean
     */
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    /**
     * Height int.
     *
     * @param root the root
     * @return the int
     */
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }
}
