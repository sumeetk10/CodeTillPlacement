import java.util.Arrays;

public class Day5 {
   
        public static void main(String[] args) {
            int[][] arr = {{2,6},{1,7},{8,12},{10,15}};
            System.out.println(findMinArrowShots(arr));
        }
        static int findMinArrowShots(int[][] points) {
            // edge cases
            if(points == null || points.length == 0){
                return 0;
            }
    
            int countArrows = 0;
            int prevIndex = 0;
    
            Arrays.sort(points, (a, b)->(Integer.compare(a[1], b[1])));
    
            for(int index = 0;index < points.length;index++){           //compare the pair 1st index
                if(points[index][0] > points[prevIndex][1]){            //with pair 2nd index
                    countArrows++;                                      //row wise compare,with 2nd index
                    prevIndex = index;
                }
            }
    
            return countArrows+1;
        }
    }
    

