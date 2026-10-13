/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Node current = head;
        Node prev = null;
        Node newNode;
        while(current!=null){
            Node next = current.next;
            newNode = new Node(current.val);
            if(current!=head){
                prev.next = newNode;
            }
            prev = newNode;
            map.put(current,newNode);
            current = next; 
    
        }
        prev.next= null;
        current = head;
        Node temp = map.get(current);
        while(current!= null){
            newNode = map.get(current);
            newNode.random = map.get(current.random);
            current = current.next;
        }
        return temp;
        
    }
}
