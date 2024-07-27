package Basic_Maths;

import java.util.Scanner;
import java.util.ArrayList;
public class factors {
  public class factors {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
      System.out.println("Enter a number you want to see the factors:");
      int no = sc.nextInt();
  
      // Square root calculation should be done on the number itself
      double no1 = Math.sqrt(no);
      ArrayList<Integer> store = new ArrayList<>();
  
      for (int i = 1; i <= no1; i++) {
        if (no % i == 0) 
        { 
          store.add(i);   
          if (no / i != i)
           { 
            store.add(no / i); 
          }
        }
      }
  
      // Print the factors
      System.out.println("Factors of " + no + " are: " + store);
  
      sc.close();
    }
  }
