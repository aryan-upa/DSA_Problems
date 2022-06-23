package CollegeHackerRank;

public class OddEvenLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node oddHead;
    Node evenHead;

    public void takeInput(int data) {
        Node temp = new Node(data);
        if(head == null) {
            head = temp;
        }
        else {
            Node trav = head;
            while (trav.next != null)
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

    public Node createNewLL() {
        Node odd = head;
        if(head.next != null) {
            Node evenHead = odd.next;
            Node even = odd.next;
            while(odd.next != null || even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return odd;
    }

    public static void main(String[] args) {
        OddEvenLL newLL = new OddEvenLL();
        for (int i = 0; i < 10; i++) {
            newLL.takeInput(i);
        }
        display(newLL.head);
        var newNode = newLL.createNewLL();
        display(newNode);
    }
} 