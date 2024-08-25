package Array.Easy;
public class missingNumber {
  public static void main(String args[])
  {
    int arr[] = {1,2,4,5};//4
    //bruteforce method
    //hashing
    int n=arr.length;
    int flag =0;
    for(int i = 1; i <=n; i++)
    {
      for(int j =0;j<n-1;j++)
      {
        if(arr[j] == i)
        {
          flag =1;
          break;
        }
      }
      if(flag == 0)
      {
        System.out.println("Missing number is :"+i);
        break;
      }
    }
    System.out.print("nhk")

  }
}
