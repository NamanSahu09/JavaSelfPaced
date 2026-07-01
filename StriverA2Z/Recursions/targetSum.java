import java.util.*;
public class targetSum 
{
  ArrayList<Integer> list = new ArrayList<>();
  int s = 0;
  public void display(int idx,int arr[], int sum,int n)
  {
      if(idx == n)
      {
        if(s == sum)
        {
          for(int i =0;i<list.size();i++)
          {
            System.out.print(list.get(i) + " ");
          }
          System.out.println();
        }
        return;
      }
      //taking
      list.add(arr[idx]);
      s+=arr[idx];
      display(idx+1,arr,sum,n);
      //not taking
      list.remove(list.size() - 1);
      s-=arr[idx];
      display(idx+1,arr,sum,n);
  }
  public static void main(String args[])
  {
    targetSum obj = new targetSum();
    int arr[] = {1,2,1};
    int target = 2;
    int n = arr.length;
    obj.display(0,arr,target,n);

    

  }
  
}
