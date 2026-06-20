import java.util.*;
public class findKthLargest
{

   public static int kthLargest(int arr[], int k)
   {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int n = arr.length;

    for(int i=0;i<k;i++)
    {
      pq.add(arr[i]);
    }

    for(int i=0;i<n;i++)
    {
      if(arr[i]>pq.peek())
      {
        pq.poll();
        pq.add(arr[i]);

      }
    }

    return pq.peek();
   }



    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(kthLargest(nums, k));
    }
}
