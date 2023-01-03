public class FindDuplicateElement {
    class Solution {
        public int findDuplicate(int[] nums) {
            // Solution using hashing 
            int ans = 0;
            int[] count = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                if(count[nums[i]]==1){
                    ans = nums[i];
                    break;
                }
                else{
                    count[nums[i]]++;
                }
            }
            
            return ans;
        }
    }
}

// Not optimal but consider it for understanding

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            //int j=0;
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        
        for(int i=0; i<n; i++) {
            if(map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }
    
}


