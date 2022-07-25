package Tree;

public class TopviewBT {
    class Pair{
        Node curr;
        int level;
        Pair(Node node,int l){
            this.curr = node;
            this.level = l;
        }
    }
    class Solution
    {
        
        static ArrayList<Integer> topView(Node root)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            if(root == null) return ans;
            
            Map<Integer,Integer> mp = new TreeMap<>();
            Queue<Pair> q = new ArrayDeque<>();
            
            q.add(new Pair(root,0));
            
            while(q.size()>0){
                Pair p = q.poll();
                if(!mp.containsKey(p.level)){
                    mp.put(p.level,p.curr.data);
                }
                if(p.curr.left!=null){
                    q.add(new Pair(p.curr.left,p.level-1));
                }
                if(p.curr.right!=null){
                    q.add(new Pair(p.curr.right,p.level+1));
                }
            }
            for(int i:mp.keySet()){
                ans.add(mp.get(i));
            }
            return ans;
        }
    }
}
