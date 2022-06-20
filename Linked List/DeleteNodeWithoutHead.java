package Linked List;

public class DeleteNodeWithoutHead {
    void deleteNode(Node del)
    {
         // Your code here
         if(del.next != null) {
             del.data = del.next.data;
             del.next = del.next.next;
         }
         
         else {
             del = null;
         }
    }
}
