// elements right to the maximum element in array should be minimum
// rightmost element should always be present
// second maximum element between rightmost and maximum element

package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray {
    class Solution{
        //Function to find the leaders in the array.
        static ArrayList<Integer> leaders(int arr[], int n){
            // Your code here
            ArrayList<Integer> array = new ArrayList<>();
            int max = 0;
            for(int i=n-1; i>=0; i--) {
                if(arr[i] >= max) {
                    max = arr[i];
                    array.add(max);
                }
            }
            Collections.reverse(array);
            
            return array;
        }
    }
}
