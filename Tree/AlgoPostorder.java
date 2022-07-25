package Tree;

import java.util.ArrayList;

public class AlgoPostorder {
    class Solution {
        ArrayList<Integer> a = new ArrayList<>();
        
        public List<Integer> postorderTraversal(TreeNode root) {
            
            postOrder(root);
            
            return a;      
        }
        
        public void postOrder(TreeNode curr) {
            if(curr == null) {
                return;
            }
            
            postOrder(curr.left);
            postOrder(curr.right);
            a.add(curr.val);
        }
    }
}
