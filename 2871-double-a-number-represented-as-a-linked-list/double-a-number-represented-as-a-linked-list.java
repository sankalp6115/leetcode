class Solution {
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode rev = reverse(head);
        int carry = 0;
        ListNode temp = rev;
        while(temp != null){
            int num = temp.val * 2 + carry;
            temp.val = num % 10;
            carry = num / 10;
            temp = temp.next;
        }

        rev = reverse(rev);

        if(carry > 0){
            ListNode carryNode = new ListNode(carry);
            carryNode.next = rev;
            rev = carryNode;
        }
        return rev;
    }
}