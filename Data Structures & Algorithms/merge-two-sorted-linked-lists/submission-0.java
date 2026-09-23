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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode current=null;
        
        while(list1!=null && list2!=null){
            if(head != null){
                if(list1.val<=list2.val){
                    current.next=list1;
                    list1=list1.next;
                    
                }else{
                    current.next=list2;
                    list2=list2.next;
                }
                current=current.next;
                
            }else{
                if(list1.val<=list2.val){
                    current=list1;
                    head=current;
                    list1 = list1.next;
                }else{
                    current=list2;
                    head=current;
                    list2 = list2.next;
                }
            }

            
        }
        if(list1!=null){
            if(head==null){
                current=list1;
                head=current;
            }else{
                current.next=list1;      
            }
        }
        if(list2!=null){
            if(head==null){
                current=list2;
                head=current;
            }else{
                current.next=list2;      
            }
        }
        return head;

        
    }
}