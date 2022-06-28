package Leetcode;

class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        ListNode resHead = new ListNode();
        ListNode retHead = resHead;
        int Carry = 0;
        while (head1 != null || head2 != null) {

            if(head1 != null) {
                resHead.val = head1.val;
                head1 = head1.next;
            }

            if(head2 != null) {
                resHead.val += head2.val;
                head2 = head2.next;
            }

            resHead.val += Carry;

            if (resHead.val > 9) {
                resHead.val = resHead.val - 10;
                Carry = 1;
            }
            else {
                Carry = 0;
            }

            if (head1 != null || head2 != null) {
                resHead.next = new ListNode();
                resHead = resHead.next;
            }
            else if (Carry != 0){
                resHead.next = new ListNode(Carry);
            }
        }
        return retHead;
    }
}