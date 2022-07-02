// since the elements are sorted using binary search

package Arrays;

public class PeakElement {
    class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int s=0;
      int e=n-1;
      while(s<e)
      {
          int mid=(s+e)/2;
          if(arr[mid]>arr[mid+1])
          {
              e=mid;
          }
          else
          {
              s=mid+1;
          }
      }
      return e;
       
    }
}
}
