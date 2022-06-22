package com.leetcode.editor.tree;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 *
 * @author loquy
 * @date 2021 /12/06 10:25
 */
public class BinaryTreeInorderTraversal {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(5);
        TreeNode left = new TreeNode(2, left2, right2);
        TreeNode right3 = new TreeNode(6);
        TreeNode right = new TreeNode(3, null, right3);
        TreeNode treeNode = new TreeNode(1, left, right);
        List<Integer> integers = inorderTraversal(treeNode);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        TreeNode.show(treeNode);
    }

    /**
     * Inorder traversal list.
     *
     * @param root the root
     * @return the list
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    /**
     * Inorder.
     *
     * @param root the root
     * @param res  the res
     */
    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            // 递归结束条件，空则返回
            return;
        }
        // 中序遍历，左->根->右的顺序
        // 递归遍历左子树，直到没有左子树
        inorder(root.left, res);
        // 把当前节点的值添加到集合
        res.add(root.val);
        // 递归遍历右子树，直到没有右子树
        inorder(root.right, res);
    }
}
