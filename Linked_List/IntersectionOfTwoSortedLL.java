package Linked_List;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
public class IntersectionOfTwoSortedLL {
    class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    { 
        // code here.
        Node temp1 = head1;
        Node temp2 = head2;
        HashSet<Integer> s = new HashSet<>();
        
        while(temp1 != null) {
            s.add(temp1.data);
            temp1 = temp1.next;
        }
        
        Node dummy = new Node(0);
        Node newhead = dummy;
        
        while(temp2 != null) {
            if(s.contains(temp2.data))
            {
                Node n = new Node(temp2.data);
                newhead.next = n;
                newhead = n;
                s.remove(temp2.data);
            }
            temp2 = temp2.next;
        }
        return dummy.next;
    }
}
}
