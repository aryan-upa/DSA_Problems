package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class findLCA {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

//    public static void getAncestor

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//
//    }

    public static void printNodes(Stack<TreeNode> list) {
        for (TreeNode node :
                list) {
            System.out.print(node.val + "->");
        }
    }

    public static void printNodes(ArrayList<TreeNode> list) {
        for (TreeNode node :
                list) {
            System.out.print(node.val + "->");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<TreeNode> list = new ArrayList<>();
//        descendants2(root, root.left.left, list);
        printNodes(list);
    }
} 