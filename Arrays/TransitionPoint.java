package Arrays;

public class TransitionPoint {
    class GfG {
        int transitionPoint(int arr[], int n) {
      int low=0;
      int high=n-1;
      int res=-1;
      while(low<=high)
      {
          int mid=low + (high-low)/2;
          if(arr[mid]==1)
          {
              res=mid;
              high=mid-1;
          }
          else
          {
              low=mid+1;
          }
      }
      return res;
    }
        
    }
}
