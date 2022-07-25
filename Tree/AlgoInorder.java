package Tree;

public class AlgoInorder {
    class Solution {
        List<Integer> ans = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            
            inorder(root);
            return ans;
        }
        
        public void inorder(TreeNode current) {
            if(current == null) {
                return ;
            }
            inorder(current.left);
            ans.add(current.val);
            inorder(current.right);
        }
    }
}
