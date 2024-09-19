import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public class sum3 {
  public static void main(String args[])
  {
    int arr[] = {-2,-2,-1,-2,-1,-1,2,2,0,0,2,0,2};
    Arrays.sort(arr);
    ArrayList<ArrayList<Integer>>list = new ArrayList<>();
    int n = arr.length;
    for(int i = 0 ;i < n; i++)
    {
      if(i>0 && arr[i] == arr[i-1]) continue;
      int j = i + 1;
      int k = n-1;
      while(j<k)
      {
        int sum = arr[i] + arr[k] + arr[j];
        if(sum > 0)
        {
          k--;
        }
        else if(sum < 0)
        {
          j++;
        }
        else
        {
          
          List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
          list.add(temp);

          j++;
          k--;
          while(j<k && arr[j] == arr[j+1]) j++;
          while(j<k && arr[k] == arr[k-1]) k--;
          

        }
      }
    }
    System.out.print()
  }
  
}
