package CollegeHackerRank;

public class EquivalentTree {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.right = this.left = null;
        }
    }

    Node root;

    public static boolean isEquivalent(Node root1, Node root2) {
        if(root1 == null && root2 == null)
            return true;
        else if(root1 == null || root2 == null)
            return false;
        else if(root1.data != root2.data)
            return false;
        else
            return isEquivalent(root1.left, root2.left) && isEquivalent(root1.right, root2.right);
    }

    public static void main(String[] args) {
        EquivalentTree root1 = new EquivalentTree();
        root1.root = new Node(1);
        root1.root.left = new Node(2);
        root1.root.right = new Node(3);

        EquivalentTree root2 = new EquivalentTree();
        root2.root = new Node(1);
        root2.root.left = new Node(2);
        root2.root.right = new Node(3);

        System.out.println(isEquivalent(root1.root,root2.root));


    }
} 