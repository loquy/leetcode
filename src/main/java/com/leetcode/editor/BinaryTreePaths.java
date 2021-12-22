package com.leetcode.editor;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 *
 * @author loquy
 * @date 2021 /12/22 8:42
 */
public class BinaryTreePaths {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3, left, right);
        List<String> strings = binaryTreePaths(treeNode);
        System.out.println(strings);
    }

    /**
     * Binary tree paths list.
     *
     * @param root the root
     * @return the list
     */
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    /**
     * Construct paths
     *
     * @param root  the root
     * @param path  the path
     * @param paths paths
     */
    public static void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuilder pathS = new StringBuilder(path);
            pathS.append(root.val);
            // 当前节点是叶子节点
            if (root.left == null && root.right == null) {
                // 把路径加入到答案中
                paths.add(pathS.toString());
            } else {
                // 当前节点不是叶子节点，继续递归遍历
                pathS.append("->");
                constructPaths(root.left, pathS.toString(), paths);
                constructPaths(root.right, pathS.toString(), paths);
            }
        }
    }
}
