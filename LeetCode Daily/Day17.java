public class Day17 {
    class Solution {
        public int minFlipsMonoIncr(String s) {
            int flipzero = 0, flipone = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '1'){                 //as soon as encountered with then only
                    flipone++;                          //start incrementing zero till then                  
                }                                       //keep it minimum
                else flipzero++;    
                
                flipzero = Math.min(flipone,flipzero);        
            }
    
            return flipzero;
        }
    }
}
