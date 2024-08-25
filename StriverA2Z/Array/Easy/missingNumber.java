package Array.Easy;
public class missingNumber {
  public static void main(String args[])
  {
    int arr[] = {1,2,3,5};//4
    //bruteforce method
    //hashing
    
    
    int n=arr.length;
    // int flag =0;
    // for(int i = 1; i <=arr.length; i++)
    // {
    //   for(int j =0;j<n-1;j++)
    //   {
    //     if(arr[j] == i)
    //     {
    //       flag =1;
    //       break;
    //     }
    //   }
    //   if(flag == 0)
    //   {
    //     System.out.println("Missing number is :"+i);
    //     break;
    //   }
    //   flag = 0;
    // }
    // System.out.print("nhk");


    //Better using Hashing



    // int hash[] = new int[n+1];
    // for(int i = 0; i<n-1; i++)
    // {
    //   hash[arr[i]] = 1;
    // }
    // for(int i = 1; i <=n; i++)
    // {
    //   if(hash[i] == 0)
    //   {
    //     System.out.println("Missing number is :"+i);
    //     break;
    //   }
    // }

    
    //Optimal 1
    // int sum = n*(n+1)/2;
    // int sum1=0;
    // for(int i=0;i<n-1;i++)
    // {
    //   sum1 += arr[i];
      
    // }
    // if(sum!=sum1)
    // System.out.println("Missing number is: "+(sum-sum1));

    //Optimal 2
    int XOR1 = 0;
    int XOR2=0;
    for(int i =0;i <n-1;i++)
    {
      XOR1 = XOR1^arr[i];
      XOR2 = XOR2^(i+1);
    }
    XOR2 = XOR2^n;
    System.out.println("Missing number is: "+(XOR1^XOR2));

    



  }
}
