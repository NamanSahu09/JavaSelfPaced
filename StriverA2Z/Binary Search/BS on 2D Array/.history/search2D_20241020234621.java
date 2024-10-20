import java.util.ArrayList;

public class search2D 
{
    
  public static boolean searchMatrix(ArrayList<Integer>list,int data)
  {
    int low = 


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
