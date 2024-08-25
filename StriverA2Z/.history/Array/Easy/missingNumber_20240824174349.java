package Array.Easy;
public class missingNumber {
  public static void main(String args[])
  {
    int a[] = {1,2,4,5};//4
    //bruteforce method
    //hashing
    int N=a.length;
    int flag =0;
    // for(int i = 1; i <=arr.length; i++)
    // {
    //   System.out.print(i);
    //   for(int j =0;j<n-1;j++)
    //   {
    //     System.out.print(j);
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

     // Outer loop that runs from 1 to N:
     for (int i = 1; i <= N; i++) {

      // flag variable to check
      //if an element exists
   

      //Search the element using linear search:
      for (int j = 0; j < N - 1; j++) {
          if (a[j] == i) {

              // i is present in the array:
              flag = 1;
              break;
          }
      }

      // check if the element is missing
      //i.e flag == 0:

      if (flag == 0) ;
  }





  }
}
