package Linked_List;

public class PairWiseSwap {
    class Solution {
        // Function to pairwise swap elements of a linked list.
        // It should returns head of the modified list
        public Node pairwiseSwap(Node head)
        {
            // code here
            int count = 0;
            Node current = head;
            Node prev = null;
            Node next = null;
            
            while(current != null && count<2) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            
            if(next != null) {
                head.next = pairwiseSwap(next);
            }
            return prev;
        }
    }
}
