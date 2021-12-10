package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 *
 * @author loquy
 * @date 2021 /12/10 16:32
 */
public class BinaryTreePreorderTraversal {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3, left, right);
        List<Integer> integers = preorderTraversal(treeNode);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        TreeNode.show(treeNode);
    }

    /**
     * Preorder traversal list.
     *
     * @param root the root
     * @return the list
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }

    /**
     * Preorder.
     *
     * @param root the root
     * @param res  the res
     */
    public static void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        // 前序遍历，根->左->右的顺序
        // 把当前节点的值添加到集合
        res.add(root.val);
        // 递归遍历左子树，直到没有左子树
        preorder(root.left, res);
        // 递归遍历右子树，直到没有右子树
        preorder(root.right, res);
    }
}
