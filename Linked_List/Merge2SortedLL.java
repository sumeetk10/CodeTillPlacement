public class Merge2SortedLL {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            
            if(list1 == null) {
                return list2;
            }
            
            if(list2 == null) {
                return list1;
            }
            
            ListNode temp = new ListNode(0);
            ListNode dummy = temp;
            
            while(list1 != null && list2 != null) {
                
                if(list1.val < list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                }
                else {
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;
            }
            
            if(list1 != null) {
                temp.next = list1;
            }
            else {
                temp.next = list2;
            }
            return dummy.next;
        }
    }
}
