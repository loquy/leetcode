package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

/**
 * 二叉树的最大深度
 *
 * @author loquy
 * @date 2021 /12/09 10:31
 */
public class MaximumDepthOfBinaryTree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3, left, right);

        int i = maxDepth(treeNode);
        System.out.println(i);
    }

    /**
     * Max depth int.
     *
     * @param root the root
     * @return the int
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            // 递归遍历左子树深度
            int leftHeight = maxDepth(root.left);
            // 递归遍历右子树深度
            int rightHeight = maxDepth(root.right);
            // 深度等于左右子树较大的深度加一
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
