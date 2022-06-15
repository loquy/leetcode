package com.leetcode.editor.tree;

import com.leetcode.utils.TreeNode;

/**
 * 翻转二叉树
 *
 * @author loquy
 * @date 2021 /12/16 13:40
 */
public class InvertBinaryTree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        TreeNode.show(treeNode);
        TreeNode treeNode1 = invertTree(treeNode);
        TreeNode.show(treeNode1);
    }

    /**
     * Invert tree tree node.
     *
     * @param root the root
     * @return the tree node
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
