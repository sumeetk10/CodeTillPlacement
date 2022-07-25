package Tree;

public class AlgoPreorder {
    class Solution {
        ArrayList<Integer> ans = new ArrayList<>();
        
        public List<Integer> preorderTraversal(TreeNode root) {
            
            preOrder(root);
            
            return ans;
        }
        
        public void preOrder(TreeNode curr) {
            
            if(curr == null) {
                return;
            }
            
            ans.add(curr.val);
            preOrder(curr.left);
            preOrder(curr.right);
        }
    }
}
