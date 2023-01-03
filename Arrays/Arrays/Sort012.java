package Arrays;

public class Sort012 {
    class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int low = 0;
        int mid = 0;
        int high = n-1;             //DNF Algorithm
        int temp;
        
        while(mid<=high) {
            switch(a[mid]) {
                case 0: temp = a[mid];
                        a[mid] = a[low];
                        a[low] = temp;
                        mid++;
                        low++;
                        break;
                
                case 1: mid++;
                        break;
                
                case 2: temp = a[mid];
                        a[mid] = a[high];
                        a[high] = temp;
                        high--;
                        break;
            }
        }
    }
}

// counting sort

void sort012(int a[], int n)
{
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    
    for(int i=0 ; i<n; i++) {
        if(a[i] == 0) {
            count0++;
            
        }
        else if(a[i] == 1) {
            count1++;
        }
        else{
            count2++;
        }
    }
    int m = count0+count1+count2;
    for(int j=0; j<m; j++) {
        if(j<count0) {
            a[j] = 0;
        }
        else if(j< count0 + count1) {
            a[j] = 1;
        }
        else {
            a[j] = 2;
        }
    }
}
}
