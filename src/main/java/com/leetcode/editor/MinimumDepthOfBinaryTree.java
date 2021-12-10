package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

/**
 * 二叉树最小深度
 *
 * @author loquy
 * @date 2021 /12/10 8:47
 */
public class MinimumDepthOfBinaryTree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3, left, right);
        minDepth(treeNode);
        TreeNode.show(treeNode);
    }

    /**
     * Min depth int.
     *
     * @param root the root
     * @return the int
     */
    public static int minDepth(TreeNode root) {
        // 叶子节点的定义是左孩子和右孩子都为 null 时叫做叶子节点
        if (root == null) {
            return 0;
        }

        // 当 root 节点左右孩子都为空时，返回 1
        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        // 当 root 节点左右孩子有一个为空时，返回不为空的孩子节点的深度
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }

        // 当 root 节点左右孩子都不为空时，返回左右孩子较小深度的节点值
        return min_depth + 1;
    }
}
