package Linked_List;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;


class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
public class UnionOfTwoLL {
    public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    TreeSet<Integer>st = new TreeSet<>();
    while(head1!=null)
    {
        st.add(head1.data);
        head1=head1.next;
    }
    while(head2!=null)
    {
        st.add(head2.data);
        head2=head2.next;
    }
    Node head = new Node(0);
    Node res = head;
    Iterator<Integer> iter = st.iterator();
    while(iter.hasNext())
    {
        Node node = new Node(iter.next());
        res.next = node;
        
        res = res.next;
    }
    return head.next;

}
}

