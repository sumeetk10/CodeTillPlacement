package LeetCode Daily;

public class Day2 {
    class Solution {
        public boolean detectCapitalUse(String str) {
             int capital = 0;
             
             for(int i=0; i<str.length(); i++) {
                 if(Character.isUpperCase(str.charAt(i))){
                     capital++;
                 }
             }
             return capital == str.length() || capital == 0 || 
             (capital == 1 && Character.isUpperCase(str.charAt(0)));          
        } 
    }
}
