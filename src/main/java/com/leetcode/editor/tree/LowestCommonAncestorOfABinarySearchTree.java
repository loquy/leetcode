package com.leetcode.editor.tree;

import com.leetcode.utils.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 二叉搜索树的最近公共祖先
 *
 * @author loquy
 * @date 2021 /12/20 9:44
 */
public class LowestCommonAncestorOfABinarySearchTree {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(8);
        TreeNode treeNode = new TreeNode(6, left, right);
        TreeNode treeNode1 = lowestCommonAncestor(treeNode, left, right);
        TreeNode.show(treeNode);
        System.out.println(treeNode1.val);
    }

    /**
     * Lowest common ancestor tree node.
     *
     * @param root the root
     * @param p    the p
     * @param q    the q
     * @return the tree node
     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = getPath(root, p);
        List<TreeNode> pathQ = getPath(root, q);
        TreeNode ancestor = null;
        for (int i = 0; i < pathP.size() && i < pathQ.size(); ++i) {
            if (pathP.get(i) == pathQ.get(i)) {
                ancestor = pathP.get(i);
            } else {
                break;
            }
        }
        return ancestor;
    }

    /**
     * Gets path.
     *
     * @param root   the root
     * @param target the target
     * @return the path
     */
    public static List<TreeNode> getPath(TreeNode root, TreeNode target) {
        List<TreeNode> path = new ArrayList<>();
        TreeNode node = root;
        while (node != target && node != null) {
            path.add(node);
            if (target.val < node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        path.add(node);
        return path;
    }
}
