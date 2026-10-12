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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null ||head.next.next==null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode secondLinkedList = slow.next;
        slow.next = null;
        ListNode first= head;
        ListNode current = secondLinkedList;
        ListNode prev = null;
        while(current!=null && current.next!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next; 
        } 
        current.next = prev;
        while(current!= null ){
            ListNode fnext = first.next;
            ListNode snext = current.next;
            first.next = current;
            current.next=fnext;
            first = fnext;
            current =snext;
        }
        
    }
}
