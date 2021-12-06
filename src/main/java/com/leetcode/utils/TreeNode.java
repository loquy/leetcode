package com.leetcode.utils;

/**
 * 树
 *
 * @author loquy
 * @date 2021/12/06 10:21
 */
public class TreeNode {

    /**
     * The Val.
     */
    public int val;

    /**
     * The Left.
     */
    public TreeNode left;

    /**
     * The Right.
     */
    public TreeNode right;

    /**
     * Instantiates a new Tree node.
     */
    public TreeNode() {
    }

    /**
     * Instantiates a new Tree node.
     *
     * @param val the val
     */
    public TreeNode(int val) {
        this.val = val;
    }

    /**
     * Instantiates a new Tree node.
     *
     * @param val   the val
     * @param left  the left
     * @param right the right
     */
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
