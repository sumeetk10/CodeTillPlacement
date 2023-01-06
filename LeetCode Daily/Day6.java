import java.util.Arrays;


public class Day6 {
    class Solution {
        public int maxIceCream(int[] costs, int coins) {
            int count = 0;
            Arrays.sort(costs);
            if(costs.length == 0) return count;
    
            for(int i=0; i<costs.length; i++){
                int res = coins-costs[i];
                if(res>=0){
                    count++;
                    coins = res;
                }
            } 
            return count;
        }
    }
}
