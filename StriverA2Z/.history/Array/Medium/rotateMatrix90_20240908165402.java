public class rotateMatrix90 {
  public static void main(String args[])
  {
    int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int n = arr.length;
    int m = arr[0].length;
    int k = m;
    int temp[][] = new int[n][m];
    for(int i=0;i<n;i++)
    {
      for(int j =0;j<m;j++)
      {
        int no = arr[i][j];
        temp[i][k] = no;
      }




    }
  }
}
