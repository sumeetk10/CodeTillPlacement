package Arrays;

public class MissingNoInArray {
    class Solution {
        int MissingNumber(int array[], int n) {
            // Your Code Here
            
            int sum1 = n *(n+1)/2;
            int sum2 = 0;
            
            for(int i=0; i < array.length; i++) {
                sum2 += array[i];
            }
            
            return (sum1 - sum2);
            
            
        }
    }
}
