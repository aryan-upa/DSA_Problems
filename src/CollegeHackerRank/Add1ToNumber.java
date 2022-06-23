package CollegeHackerRank;

import java.util.Scanner;

public class Add1ToNumber {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data) {
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

    public void display() {
        Node trav = head;
        while(trav != null) {
            System.out.print(trav.data + "->");
            trav = trav.next;
        }
        System.out.println("null");
    }

    public Node reverseLL() {

        Node next = null;
        Node curr = head;
        Node prev = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public void add1ToLL() {
        Node trav = head;
        while(trav != null && trav.data == 9) {
            trav.data = 0;
            trav = trav.next;
        }
        if(trav == null)
            add(1);
        else
            trav.data += 1;
    }

    public static Node createLL(Add1ToNumber ll, int number) {
        String numString = String.valueOf(number);
        for (char c: numString.toCharArray()){
            ll.add(c - 48);
        }
        return ll.head;
    }

    public void displayAsNum() {
        Node trav = head;
        while(trav != null) {
            System.out.print(trav.data + "");
            trav = trav.next;
        }
    }

    public void performOperation(int num) {
        var ll = this;
        ll.head = createLL(ll, num);
        System.out.println("Initial LL : ");
        ll.display();
        ll.head = ll.reverseLL();
        ll.add1ToLL();
        ll.head = ll.reverseLL();
        System.out.println("After adding 1 to LL : ");
        ll.display();
        System.out.print("Displaying as a number : ");
        ll.displayAsNum();

    }

    public static void main(String[] args) {
        Add1ToNumber ll = new Add1ToNumber();
        Scanner sc = new Scanner(System.in);
        ll.performOperation(sc.nextInt());
    }
} 