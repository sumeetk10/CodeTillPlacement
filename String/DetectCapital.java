public class DetectCapital {
    class Solution {
        public boolean detectCapitalUse(String word) {
           
           boolean result = true;
            int lower = 0;
            int upper = 0;
            
            if(Character.isUpperCase(word.charAt(0))) {
                upper++;
                result = true;
            }
            
            for(int i = 0; i<word.length(); i++) {
                
                if(i != 0 && Character.isUpperCase(word.charAt(i))) {
                    upper++;
                    result = false;
                }
                else if(Character.isLowerCase(word.charAt(i))) {
                    lower++;
                }
            }
            
            if(lower == word.length()) {
                return true;
            }
            
            if(upper == word.length()) {
                result = true;
            }
            return result;
        }
    }
}


// optimal solution

class Solution {
    public boolean detectCapitalUse(String str) {
         
        int cap=0,small=0;
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                cap+=1;
            
            else small+=1;
        }
        if(cap==str.length() || small==str.length() || 
           (str.charAt(0)>='A' && str.charAt(0)<='Z') && small==str.length()-1) 
            return true;
        return false;
    }
}
