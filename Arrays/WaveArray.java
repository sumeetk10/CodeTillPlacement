package Arrays;

public class WaveArray {
class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        
        for(int i =1; i < n; i=i+2) {
            if(a[i]> a[i-1]) {
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }
    }
}
}