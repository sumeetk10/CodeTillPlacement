public class LenghtOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {             
            
            
            
            int result=0;
            int n = s.length();
            
            if(n==0) {
                return n;
            }
            
            while(n>0) {
                
                if(s.charAt(--n) != ' ') result++;          //traverse from the last
                else if(result > 0)                         // and check with space
                    return result;
            }
            return result;
        }
    }
}
