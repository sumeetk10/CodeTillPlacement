import java.util.Collections;
import java.util.List;



public class POTD3 {
    class Solution {
        public int removeStudents(int[] H, int N) {
    
            List<Integer> list = new ArrayList<>();
            list.add(H[0]);
            for(int i = 1; i < N ; i++){    
                int num = H[i];
    
                if(num < list.get(0)){
    
                    list.set(0,num);
    
                }else if(num > list.get(list.size()-1)){
                    list.add(num);
                }else{
                    int index = Collections.binarySearch(list,num);
                    if(index < 0){
                        index = index+1;
                        list.set((index*-1),num);
                    }
                }
    
            }   
            return N - list.size();
    
        }
    };
}
