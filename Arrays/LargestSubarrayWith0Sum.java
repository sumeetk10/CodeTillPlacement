package Arrays;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int sum = 0;
        int maxlength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            
            sum += arr[i];
            
            if(sum == 0) {
                maxlength = i+1;
            }
            
            else {
                if(map.get(sum)!=null) {
                    maxlength = Math.max(maxlength,i-map.get(sum));
                }
                else {
                    map.put(sum,i);
                }
            }
            
            
        }
        return maxlength;
    }
}
}
