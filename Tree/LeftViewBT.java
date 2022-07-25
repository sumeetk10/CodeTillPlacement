package Tree;

public class LeftViewBT {
    class Tree
{
    //Function to return list containing elements of left view of binary tree.

    // for leftview use preorder traversal
    // for rightview use reverse preorder traversal(root right left)
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      leftside(root,ans,0);
      return ans;
    }
    
    public void leftside(Node curr, List<Integer> ans, int level){
        if(curr == null) {
            return;
        }
        
        if(level == ans.size()) {
            ans.add(curr.data);
        }
        
        leftside(curr.left,ans,level+1);
        leftside(curr.right,ans,level+1);
    }
}
}
