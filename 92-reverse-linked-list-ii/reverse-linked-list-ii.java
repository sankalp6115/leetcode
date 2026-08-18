class Solution {
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
    
        for(int i=1;i<left;i++){
            prev = prev.next;
        }

        ListNode reverseStart = prev.next;
        ListNode reverseEnd = reverseStart;
        
        for(int i=left;i<right;i++){
            reverseEnd = reverseEnd.next;
        }

        ListNode next = reverseEnd.next;
        reverseEnd.next = null;
        prev.next = reverse(reverseStart);
        reverseStart.next = next;

        return dummy.next;
    }
}