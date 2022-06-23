package CollegeHackerRank.DailyQuestions;

public class MoveZeroes {

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

    public static Node moveZeroes(Node head) {
        Node curr = head;
        MoveZeroes zeroLL = new MoveZeroes();
        Node prev = head;
        Node newHead = null;

        while(curr != null) {
            if(curr.data == 0) {
                zeroLL.add(curr.data);
                if(prev == curr)
                    prev = prev.next;
            }
            else {
                if(newHead == null)
                    newHead = prev;
                if(prev != curr)
                    prev.next = curr;
                prev = curr;
            }
            curr = curr.next;
        }

        Node tailOfZeroLL = zeroLL.head;
        while(tailOfZeroLL.next != null) tailOfZeroLL = tailOfZeroLL.next;

        Node trav = newHead;
        while(trav != null) {
            if(trav.next.data == 0) {
                trav.next = null;
                break;
            }
            trav = trav.next;
        }
        tailOfZeroLL.next = newHead;
        return zeroLL.head;
    }

    public static void display(Node head) {
        Node trav = head;
        while(trav != null) {
            System.out.print(trav.data + "-> ");
            trav = trav.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MoveZeroes LL = new MoveZeroes();
        LL.add(1);
        LL.add(0);
        LL.add(1);
        LL.add(2);
        LL.add(0);
        LL.add(0);
        LL.add(0);
        LL.add(2);
        LL.add(0);
        LL.add(0);

        display(LL.head);
        var newHead = moveZeroes(LL.head);
        display(newHead);

    }
} 