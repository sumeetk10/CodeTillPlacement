package Tree;

public class BottomView {
    class Pair{

        Node node;
        
        int line;
        
        Pair(int data, Node node){
        
              this.line = data;
        
              this.node = node;
        
        }
        }
        
        class Solution {
        
        public ArrayList <Integer> bottomView(Node root) {
        
        
                Queue<Pair> q = new ArrayDeque<>();
        
                Map<Integer, Integer> map = new TreeMap<>();
        
                q.add(new Pair(0, root));
        
                while(!q.isEmpty()){
        
                    Pair curr = q.poll();
        
                    map.put(curr.line, curr.node.data);
        
                    if(curr.node.left!=null) {
        
                        q.add(new Pair(curr.line-1, curr.node.left));
                    }
        
                    if(curr.node.right!=null) {
        
                        q.add(new Pair(curr.line+1, curr.node.right));
                    }
        
                }
        
                ArrayList<Integer> ans = new ArrayList<>();
        
                for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        
                    ans.add(entry.getValue());
        
                }
        
                return ans;
           }
        }
}
