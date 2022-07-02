package Linked_List;
import java.util.*;

public class RemoveDuplicateFromUnsortedLL {
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        HashSet<Integer> hs=new HashSet<>();

        Node tempNode1=head;
        Node prev=null;

        while(tempNode1 != null){
           int curr=tempNode1.data;
           if(hs.contains(curr)){
              prev.next=tempNode1.next;
           }
           else{
               hs.add(curr);
               prev=tempNode1;
           }
          tempNode1=tempNode1.next;
       }
       return head;
   }
}
