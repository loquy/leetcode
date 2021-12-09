package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

/**
 * 将有序数组转换为二叉搜索树
 * 二叉查找树（Binary Search Tree），（又：二叉搜索树，二叉排序树）它或者是一棵空树，或者是具有下列性质的二叉树：
 * 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值；
 * 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；
 * 它的左、右子树也分别为二叉排序树
 *
 * @author loquy
 * @date 2021 /12/09 13:58
 */
public class ConvertSortedArrayToBinarySearchTree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode treeNode = sortedArrayToBST(new int[]{1, 2, 3, 4});
        TreeNode.show(treeNode);
    }

    /**
     * Sorted array to bst tree node.
     *
     * @param nums the nums
     * @return the tree node
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    /**
     * Helper tree node.
     *
     * @param nums  the nums
     * @param left  the left
     * @param right the right
     * @return the tree node
     */
    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
