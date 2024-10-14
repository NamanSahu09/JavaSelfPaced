class leastCapactiyShip
{

  static boolean isPossible(int arr[],int capacity,int days)
  {
    int sum =0;
    int cnt = 1;
    int n = arr.length;
    for(int i=0;i<n;i++)
    {
      sum+=arr[i];
      if(sum>capacity)
      {
        cnt++;
        sum = arr[i];
      }
    }
     return cnt<=days;
  

  }



  public static  int leastWeightCapacity(int[] arr, int d) 
  {
    int sum =0;
    int maxi = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
      sum+=arr[i];
      maxi = Math.max(maxi,arr[i]);
    }

    int low = maxi;
    int high = sum;
    while (low <= high) 
    {
      int mid = low + (high - low) /2;
      if(isPossible(arr, mid, d))
      {
        high = mid - 1;
      }
      else
      {
        low = mid + 1;
      }
      
    }
    return low;

  }



  public static void main(String[] args) 
  {
    int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
    int d = 5;
    int ans = leastWeightCapacity(weights, d);
    System.out.println("The minimum capacity should be: " + ans);
  }
  
}
