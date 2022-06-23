package CollegeHackerRank;

public class DeleteMiddleNode {

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
        if(head == null) {
            head = temp;
        }
        else {
            Node trav = head;
            while(trav.next!= null)
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

    public Node middleNode() {
        Node fast;
        Node slow;
        Node prevOfTheSlow;

        fast = slow = prevOfTheSlow = head;

        while (fast.next.next != null) {
            prevOfTheSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prevOfTheSlow;
    }

    public void deleteMidNode() {
        Node toDelete = this.middleNode();
        toDelete.next = toDelete.next.next;
    }

    public static void main(String[] args) {
        DeleteMiddleNode ll = new DeleteMiddleNode();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.addNode(6);
        ll.display();
        ll.deleteMidNode();
        ll.display();
    }
} 