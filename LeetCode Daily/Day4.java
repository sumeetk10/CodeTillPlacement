public class Day4 {
    class Solution {
        public int minimumRounds(int[] tasks) {
            int len = tasks.length;
    
            if(len<=1){
                return -1;
            }
    
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num : tasks){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int ans = 0;
            for(int ele : map.keySet()){
                int val = map.get(ele);
                    if(val == 1) return -1;
                    ans+=(val+2)/3;
                
            }
            return ans;
        }
    }
}
