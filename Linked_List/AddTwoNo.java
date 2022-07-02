package Linked_List;

public class AddTwoNo {
    class Solution{
    
        public static Node reverse(Node head){
            Node prev = null;
            while(head != null){
                Node nxt = head.next;
                head.next = prev;
                prev = head;
                head = nxt;
            }
            return prev;
        }
        static Node addTwoLists(Node first, Node second){
            first = reverse(first);
            second = reverse(second);
            
            int carry = 0;
            Node p = first;
            Node q = second;
            Node addition = new Node(0);
            Node k = addition;
            while(p!=null || q!=null || carry !=0){
                int sum =0;
                if(p!=null){
                    sum+=p.data;
                    p=p.next;
                }
                if(q!=null){
                    sum+=q.data;
                    q=q.next;
                }
                sum+=carry;
                carry = sum/10;
                k.next = new Node(sum%10);
                k=k.next;
            }
            return reverse(addition.next);
        }
    }
}
