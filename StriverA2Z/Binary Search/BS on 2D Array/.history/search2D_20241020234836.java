import java.util.ArrayList;

public class search2D 
{
    
  public static boolean searchMatrix(ArrayList<ArrayList<Integer>>list,int data)
  {

    int n = list.size();
    int m = list.get(0).size();

    int low = 0;
    int high = (n*m) - 1;
    while (low <= high)
    {
      int mid = (low+high) >> 1;
      int row = mid/m;
      int col = mid%m;
      
    }

    return false;
  }





  public static void main(String[] args) 
  {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
    matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
    matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

    boolean result = searchMatrix(matrix, 8);
    System.out.println(result ? "true" : "false");
  }  
}
