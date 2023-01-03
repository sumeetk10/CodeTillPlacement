

public class EquilibriumPoint {                 //leftsum == rightsum
    class Solution {

    
        // a: input array
        // n: size of array
        // Function to find equilibrium point in the array.
        public static int equilibriumPoint(long arr[], int n) {
  
            
            int allsum = 0;
            int leftsum = 0;
            
            for(int i=0; i<n; i++) {
                allsum += arr[i];
            }
            
            for(int i=0; i<n; i++) {
                leftsum += arr[i];
                
                if(leftsum - arr[i] == allsum -leftsum) {
                    return i+1;
                } 
            }
            return -1;
        }
    }
}
