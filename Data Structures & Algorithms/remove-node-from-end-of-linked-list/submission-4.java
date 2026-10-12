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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int i=0;
        while(current!=null){
            i++;
            current = current.next;
        }
        if(i==1 && n==1){
            return null;
        }
        if(i==n){
            return head.next;
        }
        int k=0;
        current = head;
        while(current!=null && current.next!=null){
            k++;
            ListNode next = current.next;
            if(k==(i-n)){
                current.next=next.next;
                break;
            }
            current = next;
        }
        return head;

    }
}
