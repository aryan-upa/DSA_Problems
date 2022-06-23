package CollegeHackerRank;

import java.lang.reflect.Array;
import java.util.*;

public class LevelOrderArray {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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

    public static ArrayList<ArrayList<Node>> levelOrderArray(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        ArrayList<ArrayList<Node>> lists = new ArrayList<>();
        ArrayList<Node> levelList = new ArrayList<>();

        while (!queue.isEmpty()) {
            var currNode = queue.remove();
            if(currNode == null) {
                lists.add(levelList);
                if(queue.isEmpty())
                    break;
                else {
                    queue.add(null);
                    levelList.clear();
                }
            }
            else {
                levelList.add(currNode);
                if(currNode.right != null)
                    queue.add(currNode.right);
                if(currNode.left != null)
                    queue.add(currNode.left);
            }
        }
        return lists;
    }

    public static void printList (ArrayList<Node> list) {
        for (Node node :
                list) {
            System.out.print(node.data + ", ");
        }
    }

    public static void main(String[] args) {
        LevelOrderArray LL = new LevelOrderArray();
        LL.root = levelInput();
        ArrayList<ArrayList<Node>> resList = levelOrderArray(LL.root);
        System.out.print("[ ");
        for (ArrayList<Node> list : resList) {
            System.out.print("[ ");
            printList(list);
            System.out.println("], ");
        }
        System.out.println("]");
    }
} 