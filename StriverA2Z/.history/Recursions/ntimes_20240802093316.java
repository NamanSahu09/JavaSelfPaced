import java.util.Scanner;

public class ntimes {
  
   static void printTimes(int i, int no) {
    if (i > no)
      return;
  
    System.out.println(i);
    printTimes(i + 1, no);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Enter number of times you want to see the output... ");
    int no = sc.nextInt();
    int i = 1;
    printTimes(i, no);

    sc.close();
  }





}
