public class Day8 {
    class Solution {
        public int maxPoints(int[][] points) {
            if(points.length < 3) return points.length;
            int maxpoint = 0;
            for(int[] cord1 : points){
                HashMap<Double,Integer> map = new HashMap<>();
                for(int[] cord2 : points){
                    if(cord1 == cord2) continue;
                    double slope = 0;
                    if(cord1[0] == cord2[0]){           //if slope goes infinity
                        slope = Double.POSITIVE_INFINITY;
                    }else{
                    slope = (cord2[1] - cord1[1])/(double)(cord2[0]-cord1[0]);    //find slope
                    }
                    map.put(slope,map.getOrDefault(slope,0)+1);
                    if(map.get(slope) > maxpoint){
                        maxpoint = map.get(slope);
                    }
                }
            }
            return maxpoint+1;
        }
    }
    
}
