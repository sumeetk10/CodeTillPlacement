package LeetCode Daily;
// que - https://leetcode.com/problems/word-pattern/

public class Day1 {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            HashMap<Character,String> map = new HashMap<>();
            String[] word = s.split(" ");
    
            if(pattern.length() != word.length){
                return false;
            }
    
            for(int i=0; i<word.length; i++) {
                if(map.containsKey(pattern.charAt(i))){
                    if(!map.get(pattern.charAt(i)).equals(word[i])){
                        return false;
                    }
                }
                else{
                    if(!map.containsValue(word[i])){
                        map.put(pattern.charAt(i),word[i]);
                    }
                    else{
                        return false;
                    }
                    
                }
    
            }
            return true;
        }
    }
    
}
