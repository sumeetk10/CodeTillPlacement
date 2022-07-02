package Linked_List;

public class MIddleElementLL {

    class Node {
        int data;
         Node next;
         Node(int d)  { data = d;  next = null; }
     }
     
    int getMiddle(Node head)
    {
         // Your code here.
         if(head == null) {
             return -1;
         }
         
         int length =0;
         
         Node temp = head;
         
         while(temp != null) {
             length++;
             temp = temp.next;
             
         }
         Node temp2 = head;
         for(int i=1;i<=length/2;i++) {
             temp2 = temp2.next;
         }
         
         return temp2.data;
    }
}
