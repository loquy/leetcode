package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

/**
 * 相同的树
 *
 * @author loquy
 * @date 2021 /12/09 9:12
 */
public class SameTree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3, left, right);

        TreeNode left1 = new TreeNode(4);
        TreeNode right1 = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(3, left1, right1);

        TreeNode left2 = new TreeNode(1);
        TreeNode right2 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(3, left2, right2);

        boolean sameTree = isSameTree(treeNode, treeNode1);
        boolean sameTree1 = isSameTree(treeNode, treeNode2);
        System.out.println(sameTree);
        System.out.println(sameTree1);
    }

    /**
     * Is same tree boolean.
     *
     * @param p the p
     * @param q the q
     * @return the boolean
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // 当两棵树的当前节点都为 null 时返回 true
        if (p == null && q == null) {
            return true;
        }
        // 当其中一个为 null 另一个不为 null 时返回 false
        if (p == null || q == null) {
            return false;
        }
        // 当两个都不为空但是值不相等时，返回 false
        if (p.val != q.val) {
            return false;
        }
        // 递归遍历对比所有子树
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
