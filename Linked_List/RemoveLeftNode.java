package Linked_List;

public class RemoveLeftNode {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//approach 1= reverse the LL and traverse from end with continuously finding the max
// approach2 + intuition
 /*we are using monotonic stack to store the current data and pops it out if we found any 
  * other current node data greater than the stored in stack and store the current data to stack
  */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode curr = head;

        while(curr != null){
            while(!st.isEmpty() && st.peek()<curr.val){
                st.pop();
            }
            
            st.push(curr.val);
            curr = curr.next;
        }

        ListNode newList = new ListNode();
        ListNode latest = newList;

        for(int num : st){
            ListNode newNode = new ListNode(num);
            latest.next = newNode;
            latest = latest.next;
        }
        return newList.next;
    }
}
}
