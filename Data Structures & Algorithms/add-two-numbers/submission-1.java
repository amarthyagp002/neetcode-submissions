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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int sum = 0;
        int carry = 0;
        ListNode prev = null;
        ListNode head = null;
        int digit = 0;

        while (temp1 != null && temp2 != null) {
            sum = temp1.val + temp2.val + carry;

            if (sum < 10) {
                digit = sum;
                carry = 0;
            } else {
                digit = sum % 10;
                carry = sum / 10;
            }

            ListNode newNode = new ListNode(digit);
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (head == null) {
                head = newNode;
                prev = newNode;
                continue;
            }

            prev.next = newNode;
            prev = newNode;
            
        }

        while (temp1 != null) {
            sum = temp1.val + carry;

            if (sum < 10) {
                digit = sum;
                carry = 0;
            } else {
                digit = sum % 10;
                carry = sum / 10;
            }
            ListNode newNode = new ListNode(digit);
            prev.next = newNode;
            prev =newNode;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            sum = temp2.val + carry;

            if (sum < 10) {
                digit = sum;
                carry = 0;
            } else {
                digit = sum % 10;
                carry = sum / 10;
            }

            ListNode newNode = new ListNode(digit);
            prev.next = newNode;
            prev =newNode;
            temp2 = temp2.next;
        }
        if(carry>0){
            prev.next = new ListNode(carry);
        }
        return head;
    }
}
