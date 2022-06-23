package CollegeHackerRank.DailyQuestions;

public class RotatePair {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addNode(int data) {
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

    public static void display(Node head) {
        Node trav = head;
        while(trav != null) {
            System.out.print(trav.data + "-> ");
            trav = trav.next;
        }
        System.out.println("null");
    }

    public static Node doFunction(Node head) {
        if(head == null)
            return null;
        Node prev = head;
        Node newHead = head.next;
        Node curr = prev.next;

        while(true) {
            if(newHead == null) {
                newHead = head;
                break;
            }
            if(curr.next == null) {
                prev.next = null;
                curr.next = prev;
                break;
            }
            else if(curr.next.next == null) {
                prev.next = curr.next;
                curr.next = prev;
                break;
            }
            else {
                Node temp = curr.next;
                prev.next = curr.next.next;
                curr.next = prev;
                curr = temp.next;
                prev = temp;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        RotatePair LL = new RotatePair();
        LL.addNode(1);
        LL.addNode(2);
        LL.addNode(3);
        LL.addNode(4);
//        LL.addNode(5);
//        LL.addNode(6);
//        LL.addNode(7);
//        LL.addNode(8);
        display(LL.head);
        display(doFunction(LL.head));
    }
} 