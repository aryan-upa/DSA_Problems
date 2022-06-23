package CollegeHackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;

public class RotateLL {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addNode(int data) {
        Node temp = new Node(data);
        if(head == null) {
            head = temp;
        }
        else {
            Node trav = head;
            while(trav.next != null) {
                trav = trav.next;
            }
            trav.next = temp;
        }
    }

    public Node reverseLL() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public void display() {
        Node trav = head;
        while(trav != null) {
            System.out.print(trav.data + "->");
            trav = trav.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RotateLL ll = new RotateLL();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.display();
        ll.head = ll.reverseLL();
        ll.display();
    }
} 