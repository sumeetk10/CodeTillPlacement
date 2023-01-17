package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubset {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        genSub(0,arr,outer,inner);
        //System.out.println(genSub(0,arr,outer,inner));
    }

    public static void genSub(int ind, int[] nums, List<List<Integer>> result, ArrayList<Integer> curr){
        // add whatever is in current
        result.add(new ArrayList<Integer>(curr));
        //now choose the element
        for(int i=ind;i<nums.length;i++){
            //add current element
            curr.add(nums[i]);
            //now choose the next element for combination
            genSub(i+1, nums, result,curr);
            //now remove last element to make space for new combination
            curr.remove(curr.size()-1);
        }
        //return result;
    }
}
