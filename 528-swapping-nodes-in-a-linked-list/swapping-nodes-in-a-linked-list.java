/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return head;
        int n=0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        ListNode firstK = head;
        for(int i=1;i<k;i++){
            firstK = firstK.next;
        }
        ListNode lastK = head;
        for(int i=1;i<=(n-k);i++){
            lastK = lastK.next;
        }

        if(firstK == lastK) return head;

        // System.out.println(firstK.val + " " + lastK.val);
        int t = lastK.val;
        lastK.val = firstK.val;
        firstK.val = t;
        return head;
    }
}