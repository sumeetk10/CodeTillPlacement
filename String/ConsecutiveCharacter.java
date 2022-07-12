public class ConsecutiveCharacter {
    class Solution {
        public int maxPower(String s) {
            
            int ans = 1;
            int pow = 1;
            
            for(int i=1; i<s.length(); i++) {
                if(s.charAt(i) == s.charAt(i-1)) {
                    pow++;
                }
                 else {
                    ans = Math.max(ans, pow);
                    pow = 1;
                }
            }
            
            return Math.max(ans,pow);
        }
    }
}
