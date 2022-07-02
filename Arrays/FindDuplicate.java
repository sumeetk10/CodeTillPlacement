// find duplicate elements in array
// first sort array
// traverse through the sorted array and 
// add elements the hashset as well as check for adjacent element
// copy all the elements of hashset to arraylist and then sort it

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class FindDuplicate {
    class Solution {
        public static ArrayList<Integer> duplicates(int arr[], int n) {
            // code here
            
            HashSet<Integer> hash = new HashSet<>();
            Arrays.sort(arr);
            
            for(int i=0; i< n-1; i++) {
                
                if(arr[i] == arr[i+1]) {
                    hash.add(arr[i]);
                }
            }
            
            if(hash.size()==0) {
                hash.add(-1);
            }
            
            ArrayList<Integer> newlist = new ArrayList<>(hash);
            Collections.sort(newlist);
            return newlist;
        }
    }

}
