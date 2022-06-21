package CodeStudio;

import java.util.ArrayList;

public class C794944 {
    static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

    public static boolean nodePath(BinaryTreeNode<Integer> root, int node, ArrayList<BinaryTreeNode<Integer>> untilHere) {
        if(root == null)
            return false;

        untilHere.add(root);

        if(root.data == node)
            return true;

        if(nodePath(root.left, node, untilHere) || nodePath(root.right, node, untilHere))
            return true;

        untilHere.remove(untilHere.size() - 1);
        return false;
    }

    public static BinaryTreeNode<Integer> lcaOfThreeNodes (BinaryTreeNode<Integer> root, int node1, int node2, int node3) {

        ArrayList<BinaryTreeNode<Integer>> path1 = new ArrayList<>();
        ArrayList<BinaryTreeNode<Integer>> path2 = new ArrayList<>();
        ArrayList<BinaryTreeNode<Integer>> path3 = new ArrayList<>();

        nodePath(root, node1, path1);
        nodePath(root, node2, path2);
        nodePath(root, node3, path3);

        int minPath = Math.min(path1.size(), Math.min(path2.size(), path3.size()));

        BinaryTreeNode<Integer> currNode = root;
        for (int i = 0; i < minPath; i++) {
            if(path1.get(i) == path2.get(i) && path1.get(i) == path3.get(i))
                currNode = path1.get(i);
            else
                break;
        }

        return currNode;
    }
}

/*
    Approach is that:
        First I created an ArrayList of BinaryTreeNode having all nodes upto the node to be found.
        In those array lists I found the minimum size array and traversed all arrays upto that array. In each iteration
        I compared all the current elements of all arrays and then set the result as curr node. At the point these nodes
        do not match we break the loop and return the currNode.
        The currNode is the result or the LCA of given nodes.

        TimeComplexity is O(n).
 */
