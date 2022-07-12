package Tree;

public class CheckBalancedBT {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            isBalance=true;
            height(root);
            return isBalance;
            
        }
        static boolean isBalance=true;
        int height(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
            if(Math.abs(left-right)>1){
                isBalance=false;
            }
            
            return Math.max(left,right)+1;
        }
    }
}
