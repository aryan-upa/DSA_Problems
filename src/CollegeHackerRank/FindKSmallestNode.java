package CollegeHackerRank;

import java.util.ArrayList;

public class FindKSmallestNode {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root;

    public Node insertDataHelper(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        if(root.data > data) {
            root.left = insertDataHelper(root.left, data);
        }
        else {
            root.right = insertDataHelper(root.right, data);
        }
        return root;
    }

    public void preOrderList(ArrayList<Node> list, Node node) {
        if(node == null)
            return;
        preOrderList(list, node.left);
        list.add(node);
        preOrderList(list, node.right);
    }

    public Node findKthSmallest(int K) {
        ArrayList<Node> listOfNodes = new ArrayList<>();
        preOrderList(listOfNodes, root);
        return listOfNodes.get(K-1);
    }

    public static void main(String[] args) {
        int[] arr = {7,6,8,4,5,9,10,0,1,2,3};
        FindKSmallestNode LL = new FindKSmallestNode();
        for (int val : arr) 
            LL.root = LL.insertDataHelper(LL.root, val);
        System.out.println(LL.findKthSmallest(3).data);
    }

} 