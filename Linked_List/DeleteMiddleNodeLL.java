package Linked_List;

public class DeleteMiddleNodeLL {
    class Solution {
        Node deleteMid(Node head) {
            // This is method only submission.
            // You only need to complete the method.
            if(head == null || head.next == null) {
                return head;
            }
            
            Node fast = head;
            Node slow = head;
            Node dummy = null;
            
            while(fast != null && fast.next != null) {
                dummy = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            
            dummy.next = slow.next;
            return head;
            
        }
    }
}
