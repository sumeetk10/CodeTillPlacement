package Linked_List;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
public class RemoveDuplicateFromSortedLL {
    class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        if(head == null && head.next == null) {
            return head;
        }
        
        Node temp = head;
        
        while(temp != null && temp.next != null) {
            
            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        
        return head;
	
    }
}
}
