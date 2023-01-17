//Pre-order Traversal

public class Day9 {
class Solution {   
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

    public void preorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}
}
