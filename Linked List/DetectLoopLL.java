public class DetectLoopLL {
    class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
    public static boolean detectLoop(Node head){
        
        if(head == null) {
            return false;
        }
        
        Node hair = head;
        Node tail = head;
        
        while(tail != null && tail.next != null) {
            
            hair = hair.next;
            tail = tail.next.next;
            
            if(hair == tail) {
                return true;
            }

        }
        
        return false;
        
    }
}
