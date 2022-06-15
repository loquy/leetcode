package com.leetcode.editor.tree;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的后序遍历
 * @author loquy
 * @date 2021/12/10 16:40
 */
public class BinaryTreePostorderTraversal {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3, left, right);
        List<Integer> integers = postorderTraversal(treeNode);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        TreeNode.show(treeNode);
    }

    /**
     * postorder traversal list.
     *
     * @param root the root
     * @return the list
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    /**
     * postorder.
     *
     * @param root the root
     * @param res  the res
     */
    public static void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        // 后序遍历，左->右->根的顺序
        // 递归遍历左子树，直到没有左子树
        postorder(root.left, res);
        // 递归遍历右子树，直到没有右子树
        postorder(root.right, res);
        // 把当前节点的值添加到集合
        res.add(root.val);
    }
}
