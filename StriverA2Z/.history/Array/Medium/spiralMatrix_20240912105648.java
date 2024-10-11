import java.util.ArrayList;

public class spiralMatrix{
  public static void main(String args[])
  {
    /*
     * 1   2  3  4
     * 12 13 14  5
     * 11 16 15  6
     * 10  9  8  7
     */

     int arr[][] = {{1, 2, 3, 4},
     {5, 6, 7, 8},
     {9, 10, 11, 12},
     {13, 14, 15, 16}};

     ArrayList<Integer> list = new ArrayList<>();
     int r = arr.length;
     int c = arr[0].length;
     int left = 0,right = r-1, top = 0, bottom = c-1;
     
     while(left <= right && top <= bottom)
     {
      for(int i=left;i<=right;i++)
      {
        list.add(arr[left][i]);
      }
      top++;
      for(int i= top; i <=bottom;i++)
      {
        list.add(arr[]);
      }
     }


  }
  
}
