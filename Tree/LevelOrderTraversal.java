package Tree;

public class LevelOrderTraversal {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        public List<List<Integer>> levelOrder(TreeNode root) {
            
            levelOrder(root,0);
            
            return ans;
            
        }
        
        public void levelOrder(TreeNode root, int level) {
            
            if(root == null) {
                return;
            }
            
            if(ans.size()< level+1) {
                ans.add(new ArrayList<>());
            }
            ans.get(level).add(root.val);
            levelOrder(root.left,level+1);
            levelOrder(root.right,level+1);
            
        }
    }
}
