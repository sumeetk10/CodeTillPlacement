package Arrays;

public class RotateArray {
    class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        if(d<n){
        reverse(arr,0,(d-1));
        reverse(arr,d,(n-1));
        reverse(arr,0,(n-1));
    }
    else{
       if(d>n){   // if cycle exist,reduce the steps
           d=d-n;
       reverse(arr,0,(d-1));
       reverse(arr,d,(n-1));
       reverse(arr,0,(n-1));
           
       }
    }
    }
    public static void reverse(int arr[], int low, int high) {
        while (low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            
            low++;
            high--;
        }
    }
}
}
