public class ReverseString {
    class Solution {
        public void reverseString(char[] s) {           //given character array, reverse characters
            
            int i = 0;
            int j = s.length -1;
            
            while(i<j) {
                char ch = s[i];
                s[i] = s[j];
                s[j] = ch;
            
                 i++;
                 j--;
            }
        }
    }
}
