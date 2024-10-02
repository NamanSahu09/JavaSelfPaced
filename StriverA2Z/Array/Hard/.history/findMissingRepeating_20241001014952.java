import java.util.*;
public class findMissingRepeating 
{

  public static void main(String args[])
  {
  int arr[] = {1,1,2,3,4,5};
  int n = arr.length;
  int sum = n*(n+1)/2;
  int summ = n*(n+1) * (2*n+1);
  


  int sum1=0;
  for(int i=0;i<n;i++)
  {
    sum1 = sum1+arr[i];
  }

  int x=sum,y=sum1;
  int eq1 = x - y;
  


}

 
  


}
