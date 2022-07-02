package Arrays;

public class RemoveDuplicateFromSorted {
    
class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        
        int left = 0;
        int right = 1;
        
        for(right =1; right<N; right++) {
            if(A[right] != A[left]) {
                left++;
                A[left] = A[right];
            }
        }
        return left+1;
        

    }
}
}
