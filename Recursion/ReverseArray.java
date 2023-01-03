package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        int n=arr.length-1;
        reverse(arr,0,n);

    }

    static void reverse(int[] arr, int l, int r) {
        if(l>r){
            return;
        }
        swap(arr[l],arr[r]);
        reverse(arr,l+1,r-1);
    }

    static void swap(int left, int right){
        int temp = left;
        left = right;
        right = temp;
    }
}
