import java.util.*;

class max1s
{


  public static int bsRows(ArrayList<Integer> arr,int m,int x)
  {
    int ans = m;
    int low = 0;
    int high = m - 1;
    while(low <= high)
    {
      int mid = low + high >> 1;
      if(arr.get(mid) < x)
      {
        low = mid + 1;
      }
      else
      {
        ans = mid;
        high = mid - 1;
      }
    }
    return ans;
  }



  public static int rowWithMax1s(ArrayList<ArrayList<Integer>>arr,int n,int m)
  {
    int max_cnt=0;
    int index = -1;
    for(int i=0;i<n;i++)
    {
      int cnt = m - bsRows(arr.get(i),m,1);
      if(cnt > max_cnt)
      {
        max_cnt = cnt;index = i;
      }


    }

    return index;

  }





public static void main(String[] args)
 {
  ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
  matrix.add(new ArrayList<>(Arrays.asList(, 1, 1)));
  matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
  matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

  int n = 3, m = 3;
  System.out.println("The row with the maximum number of 1's is: " + rowWithMax1s(matrix, n, m));
}
}