package Tree;

import java.util.ArrayList;
import java.util.Stack;

import Tree.SameOrNot.TreeNode;

public class MorrisPreorder {
    
    ArrayList<Integer> ans = new ArrayList<>();
    Stack<TreeNode> st = new Stack<>();

    if(root == null) {
        return ans;
    }

    st.push(root);

    while(!st.isEmpty()) {
        TreeNode curr = st.pop();
        ans.add(curr.val);

        if(curr.right != null)  st.push(curr.right);
        if(curr.left != null)  st.push(curr.left);
    }
    return ans;
}
}
