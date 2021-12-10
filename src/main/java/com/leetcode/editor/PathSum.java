package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 路径总和
 *
 * @author loquy
 * @date 2021 /12/10 9:22
 */
public class PathSum {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode treeNode = new TreeNode(1, left, right);
        boolean b = hasPathSum(treeNode, 3);
        boolean b1 = hasPathSum(treeNode, 4);
        boolean b2 = hasPathSum(treeNode, 5);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
    }

    /**
     * Has path sum boolean.
     *
     * @param root the root
     * @param sum  the sum
     * @return the boolean
     */
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
        Queue<Integer> queVal = new LinkedList<Integer>();
        // 树入队
        queNode.offer(root);
        // 节点值入队
        queVal.offer(root.val);
        while (!queNode.isEmpty()) {
            // 树出队
            TreeNode now = queNode.poll();
            // 节点值出队
            int temp = queVal.poll();
            // 当左右子树都为空，则到了叶子节点，可对比目标路径总和
            if (now.left == null && now.right == null) {
                // 节点值的路径总和等于目标值返回 true
                if (temp == sum) {
                    return true;
                }
                continue;
            }
            if (now.left != null) {
                // 左子树入队
                queNode.offer(now.left);
                // 左子树的路径节点值相加后入队
                queVal.offer(now.left.val + temp);
            }
            if (now.right != null) {
                // 右子树入队
                queNode.offer(now.right);
                // 左子树的路径节点值相加后入队
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }
}
