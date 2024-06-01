import java.util.Scanner;

public class first{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int [][] arr = new int[3][3];

    System.out.println("Enter elements ");

    for(int i=0;i<3;i++)
    {
      for(int j =0;j<3;j++)
      {
        System.out.println("Enter Name for : " + i + " row and " + j + " column: ");
        arr[i][j] = sc.nextInt();
      }
    }

    for(int i=0;i<3;i++)
    {
      for(int j =0;j<3;j++)
      {
        System.out.print("Row " + i +" column " + j + " is " + arr[i][j]+ "\t");
      }
      System.out.println();
    }




  }
}