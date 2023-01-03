package Recursion;

import java.util.ArrayList;

public class AllSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> al = new ArrayList<>();
        subsequence(arr,al,0);
    }

    static void subsequence(int[] arr, ArrayList<Integer> al, int index) {
        if(index == arr.length){
           // if(al.size()>1){
                System.out.println(al);
           // }
        }
        else{
            subsequence(arr, al, index+1);
            al.add(arr[index]);
            subsequence(arr, al, index+1);
            al.remove(al.size()-1);
        }
       return;
    }
}
