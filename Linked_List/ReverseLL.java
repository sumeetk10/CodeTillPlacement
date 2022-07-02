package Linked_List;

public class ReverseLL {
    class Node {
        int data;
         Node next;
         
         Node(int d)  { data = d;  next = null; }
     }
    Node reverseList(Node head)
    {
        // code here
        if(head == null && head.next == null) {
            return head;
        }
        
        Node temp1 = null;
        Node temp2 = null;
        Node temp3 = head;
        
        while(temp3 != null) {
            temp1 = temp3.next;
            temp3.next = temp2;
            temp2 = temp3;
            temp3 = temp1;
        }
        
        
        head = temp2;
        return head;
    }
}
