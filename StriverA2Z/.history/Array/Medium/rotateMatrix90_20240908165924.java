public class rotateMatrix90 {
  public static void main(String args[])
  {
    int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int n = arr.length;
    int m = arr[0].length;
    int k = m-1;
    int temp[][] = new int[n][m];
    for(int i=0;i<n;i++)
    {
      for(int j =0;j<m;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("Rotating");
    for(int i=0;i<n;i++)
    {
      for(int j =0;j<m;j++)
      {
        int no = 
        // temp[j][k] = no;
        temp[j][m-i-1] = arr[i][j];
      }
      k--;
    }
    for(int i=0;i<n;i++)
    {
      for(int j =0;j<m;j++)
      {
        System.out.print(temp[i][j]+" ");
      }
      System.out.println();
    }
  }
}
