package Linked_List;

public class DeleteNodeInLL {
    Node deleteNode(Node head, int x)
    {
	// Your code here
	int count = 1;
	if(count == x) {
	    head = head.next;
	    return head;
	    
	}
	Node temp1 = head;
	Node temp2 = head;
	while(count != x) {
	    temp2 = temp1;
	    temp1 = temp1.next;
	    count++;
	}
	
	if(count == x) {
	    temp2.next = temp2.next.next;
	}
	return head;
}
}
