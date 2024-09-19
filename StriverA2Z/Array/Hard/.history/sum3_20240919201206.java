import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
      int j = arr[i+1];
      int k = n-1;
      while(j<k)
      {

      }
    }
  }
  
}
