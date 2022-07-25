package Tree;

import java.util.ArrayList;
import java.util.List;

public class MorrisInorder {
    class Solution {
    
        public List<Integer> inorderTraversal(TreeNode root) {
           List<Integer> ans = new ArrayList<>();
           Stack<TreeNode> st = new Stack<>();
            
            if(root == null) {
                return ans;
            }
            
            TreeNode curr = root;
            
            while(curr!=null || !st.isEmpty()) {
                while(curr!= null) {
                    st.push(curr);
                    curr = curr.left;
                }
                
                curr = st.pop();
                ans.add(curr.val);
                curr = curr.right;
            }
            
            return ans;
        }
    }
}
