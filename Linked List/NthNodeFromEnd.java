public class NthNodeFromEnd {
    class Node {
        int data;
         Node next;
         Node(int d)  { data = d;  next = null; }
     }

    class GfG
   {
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	if(head==null){
        return -1;
    }
    int count=0;
    Node temp=head;
    Node ans=head;
    for(;temp!=null && count<n;){
        temp=temp.next;
           count++;
    }
    if(temp==null && count!=n){
        return -1;
    }
    for(;temp!=null;){
        temp=temp.next;
        ans=ans.next;
    }
    return ans.data;
    }
}

}
