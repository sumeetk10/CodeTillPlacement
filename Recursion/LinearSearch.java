package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,12,5,6};
        int target = 12;
        System.out.println(find(arr,target,0));
    }

    static int find(int[] arr, int target, int index) {
        if(arr[index] == target){
            return index;
        }
        return find(arr,target,index+1);
    }
    
}
