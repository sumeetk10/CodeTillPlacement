// https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

public class ArraySubset {
    class Compute {
        public String isSubset( long a1[], long a2[], long n, long m) {
            ArrayList<Long> list = new  ArrayList<Long>();
            for(int i = 0; i<n; i++){
                list.add(a1[i]);
            }
            for(int i = 0; i<m; i++){
                if(!list.contains(a2[i])){
                    return "No";
                }
            }
            return "Yes";
        }
     }
}
