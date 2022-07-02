package Linked_List;

import java.util.Arrays;

public class Sort01and2inLL {
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node temp = head;

int c= 0;

while (head != null) {
   c++;
   head = head.next;
}

int[] a = new int[c];
int j = 0;

while (temp != null) {
   a[j] = temp.data;
   temp = temp.next;
   j++;
}

Arrays.sort(a);

Node p = null;

for (int i = a.length - 1; i >= 0; i--) {
   Node newNode = new Node(a[i]);
   newNode.next = p;
   p = newNode;
}

return p;
    }
}

