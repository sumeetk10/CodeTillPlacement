// given an array and a target element(s) 
// you have to check for sum of continous subarray that is equal to target
// and return the index of subarray
// use two pointer approach(initially both pointed to first element)

package Arrays;

import java.util.ArrayList;

public class SubArraySum {
    class solution {
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s){

        ArrayList<Integer> result = new ArrayList<>();

        int i=0,j=0,sum = 0;

        while(j<n) {

            sum += arr[j++];

            while(sum > s && i<j) {
                sum -= arr[i++];
            }
            if(sum == s) {
                result.add(i+1);
                result.add(j);
                break;
            }
        }
        if(result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }
}
}
