public class LongestPalindrom {
    class Solution {
        public int longestPalindrome(String s) {
            
            HashMap<Character,Integer> map = new HashMap<>();
            
            for(char c : s.toCharArray()) {                 //for character in char array
                map.put(c, map.getOrDefault(c,0)+1);        // put in map and check if already present,if present 
                                                            //make it default and add 1
            }
            
            int result=0;
            boolean odd_found = false;
            
            for(int c: map.values()) {                      //get the value from map and add to result
                if(c%2==0) 
                    result += c;
                
                else {
                    result = result + c -1;                 //if value is odd subtract 1 add to result
                    odd_found = true;
                }
            }
            
            if(odd_found)                                   //if any character comes odd times add one
                result++;
            
            return result;
        }
    }
}


/*  formula for above problem
 * 
 * [sum of all even count +         
 * sum of all odd count -1] +       add 1 if any character comes odd times
 * 
 */