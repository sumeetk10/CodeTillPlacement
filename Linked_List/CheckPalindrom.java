package Linked_List;
import java.util.ArrayList;

class ListNode
    {
        int data;
        ListNode next;
        ListNode(int d) {data = d; next = null; }
    }
public class CheckPalindrom {
    // Approach 1 using arraylist

    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode temp = head;
        while(temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        
        int j = list.size()-1;
        int i = 0;
        
        while(i<j) {
            if(list.get(i) != list.get(j))
            {
                return false;
            }        
            i++;
            j--;
            
        }
        return true;
    }

}

// Approach 2 using find middle element and reverse
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node mid = middle(head);
        Node last = reverse(mid);
        
        Node dummy_head1 = head;
        while(last != null) {
            
            if(dummy_head1.data != last.data) {
                return false;
            }
            else{
                last = last.next;
                dummy_head1 = dummy_head1.next;
            }
        }
        
        return true;
    }
    
    Node middle(Node head) {
        Node fast = head;
        Node slow = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
    
    Node reverse(Node temp) {
        Node prev = null;
        //Node curr = temp;
        
        while(temp != null) {
          Node curr = temp.next;
          temp.next = prev;
          prev = temp;
          temp = curr;
        }
        
        return prev;
        
        
    }
}
