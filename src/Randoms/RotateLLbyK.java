package Randoms;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RotateLLbyK {
    Node head;

    public void insert(int data) {
        Node temp = new Node(data);
        if(head == null)
            head = temp;
        else {
            Node trav = head;
            while(trav.next != null)
                trav = trav.next;
            trav.next = temp;
        }
    }

    public static void traverse(Node head) {
        Node trav = head;
        while(trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
    }
    
    public static Node reverseLL(Node head, int k) {
        // Reverse all or only the next k items in the linked list.
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null && k != 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        return prev; // current head
    }

    public static Node returnTail(Node head) {
        while(head.next != null)
            head = head.next;
        return head;
    }

    public static void connnectNodes(RotateLLbyK LL, ArrayList<Node> nodes, int nodesL) {
        // To connect all the individually reversed linked list into a single LL.
        LL.head = nodes.get(0);
        for (int i = 0; i < nodesL-1; i++) {
            returnTail(nodes.get(i)).next = nodes.get(i+1);
        }
    }

    public static void doOperation(RotateLLbyK LL, int k) {
        if(k>1) {
            ArrayList<Node> nodes = new ArrayList<>();

            Node trav = LL.head;
            int count = 1;
            while (trav.next != null) {
                if (count % k == 1)
                    nodes.add(trav);
                trav = trav.next;
                count = count % k + 1;
            }

            var nodesL = nodes.size();
            for (int i = 0; i < nodesL; i++) {
                nodes.set(i, reverseLL(nodes.get(i), k));
            }

            connnectNodes(LL, nodes, nodesL);
        }
        traverse(LL.head);
    }

    public static void main(String[] args) {
        RotateLLbyK LL = new RotateLLbyK();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers of items in the list : ");
        int N = sc.nextInt();
        System.out.print("Enter the value of K : ");
        int k = sc.nextInt();

        for (int i = 1; i <= N; i++)
            LL.insert(i);
        doOperation(LL, k);
    }
}
