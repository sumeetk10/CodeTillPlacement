package Linked_List;

public class LengthOfLoop {
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            int count = 1;
            if(fast == slow) {
                Node temp =fast;
                while(fast.next != temp) {
                    count++;
                    fast = fast.next;
                }
                return count;
            }
        }
        return 0;
    }
}
