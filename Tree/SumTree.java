package Tree;

public class SumTree {               // use post-order traversa;
    class Solution{
        public void toSumTree(Node root){
             findSum(root);
        }
        
        public int findSum(Node root)
        {
            if (root.left == null && root.right == null)
            {
                int val = root.data;                            //store the root value and return 
                root.data = 0;                                  //returned value will be used by
                return val;                                     // upper root node
            }
            
            int currVal = root.data;
            int a = 0, b = 0;
            if (root.left != null)
                a = findSum(root.left);
            if (root.right != null)
                b = findSum(root.right);
            root.data = a+b;
            
            return (root.data)+ currVal;
        }
    }
    
}