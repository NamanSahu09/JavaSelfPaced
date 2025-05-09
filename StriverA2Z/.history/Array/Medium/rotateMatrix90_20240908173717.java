public class rotateMatrix90 {
  public static void main(String args[])
  {
    int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int n = arr.length;
    int m = arr[0].length;

    //BRUTEFORCE 

    /* 
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
        // int no = arr[i][j];
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

    */
    //OPTIMAL

    //creating transpose matrix
    for (int i = 0; i < n-2; i++) {
      for (int j = i + 1; j < m; j++) {
          int temp = arr[i][j];
          arr[i][j] = arr[j][i];
          arr[j][i] = temp;
      }
  }


    //Now reverse the matrix
    for (int i = 0; i < n; i++) {
            reverseRow(arr[i], m);
        }

        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



  }

  private static void reverseRow(int[] row, int m) {
    int left = 0;
    int right = m - 1;
    while (left < right) {
        int temp = row[left];
        row[left] = row[right];
        row[right] = temp;
        left++;
        right--;
    }
}
}
