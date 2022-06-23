package CollegeHackerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumOfNodes {

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

    public static Node levelInput() {
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<>();
        int rootData = sc.nextInt();
        Node root = new Node(rootData);
        q.add(root);

        while (!q.isEmpty()) {
            var currNode = q.remove();
            if(currNode == null)
                break;
            int leftData = sc.nextInt();
            int rightData = sc.nextInt();
            if(leftData != -1) {
                currNode.left = new Node(leftData);
                q.add(currNode.left);
            }
            if(rightData != -1) {
                currNode.right = new Node(rightData);
                q.add(currNode.right);
            }
        }

        return root;
    }

    public static int sumOfNodes(Node root) {
        if(root == null)
            return 0;
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    public static void main(String[] args) {
        SumOfNodes LL = new SumOfNodes();
        LL.root = levelInput();
        System.out.println(sumOfNodes(LL.root));
    }
} 