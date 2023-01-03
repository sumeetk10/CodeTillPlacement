package Tree;

public class MaximumDiameter {
    class Solution {
        int max=0;
        public int check(TreeNode root)
        {
        if(root==null)
        return 0;
        int l=check(root.left);
        int r=check(root.right);
        int tot=l+r;
        
            max=Math.max(max,tot);
            
            return 1+Math.max(l,r);
        }
        
        public int diameterOfBinaryTree(TreeNode root) {
          check(root);
            return max;
        }
        }
}
