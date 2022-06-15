package com.leetcode.editor.tree;

import com.leetcode.utils.TreeNode;

import java.util.List;

/**
 * 左叶子之和
 *
 * @author loquy
 * @date 2021 /12/30 14:46
 */
public class SumOfLeftLeaves {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3, left, right);
        TreeNode treeNode1 = new TreeNode(6, treeNode, treeNode);
        TreeNode treeNode2 = new TreeNode(7, treeNode1, treeNode1);
        TreeNode.show(treeNode2);
        int i = sumOfLeftLeaves(treeNode2);
        System.out.println(i);
    }

    /**
     * Sum of left leaves int.
     *
     * @param root the root
     * @return the int
     */
    public static int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    /**
     * Dfs int.
     *
     * @param node the node
     * @return the int
     */
    public static int dfs(TreeNode node) {
        // 深度优先搜索，递归遍历左右子树
        int ans = 0;
        if (node.left != null) {
            // 左子树不等于null，是叶子节点则返回节点值，否则递归遍历左子树
            ans += isLeafNode(node.left) ? node.left.val : dfs(node.left);
        }

        if (node.right != null && !isLeafNode(node.right)) {
            // 右子树不等于null，且不为叶子节点，则递归遍历右子树
            ans += dfs(node.right);
        }
        return ans;
    }

    /**
     * Is leaf node boolean.
     *
     * @param node the node
     * @return the boolean
     */
    public static boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
