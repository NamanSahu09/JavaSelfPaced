import java.util.*;
public class findMissingRepeating 
{

  public static void main(String args[])
  {
  int arr[] = {1,1,2,3,4,5};
  int n = arr.length;
  int sum = n*(n+1)/2;
  int summ = n*(n+1) * (2*n+1)/6;



  int sum1=0;
  int sum2=0;
  for(int i=0;i<n;i++)
  {
    sum1 = sum1+arr[i];
    sum2 = sum2 + arr[i] * arr[i];
  }

  int eq1 = sum1 - sum;
  int eq2 = sum2 - summ;    
  
  eq2 = eq1 

}

 
  


}
