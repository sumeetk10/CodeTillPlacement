public class SpiralOrder
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> ar = new ArrayList<>();
         if(root==null){
            return ar;
        }
 
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
 
        s1.push(root);
        while(s1.isEmpty()==false || s2.isEmpty()==false){
            while(s1.isEmpty()==false){
                Node temp = s1.peek();
                s1.pop();
                ar.add(temp.data);
                if(temp.right!=null){
                    s2.push(temp.right);
                }
                if(temp.left!=null){
                    s2.push(temp.left);
                }
            }
 
            while(s2.isEmpty()==false){
                Node temp = s2.peek();
                s2.pop();
                ar.add(temp.data);
 
                if(temp.left!=null){
                    s1.push(temp.left);
                }
                if(temp.right!=null){
                    s1.push(temp.right);
                }
            }
        }
        return ar;

    }
        
    
}

