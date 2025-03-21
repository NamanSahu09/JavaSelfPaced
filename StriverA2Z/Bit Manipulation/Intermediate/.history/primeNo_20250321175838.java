import java.util.*;
public class primeNo {
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    //Sive of erathosthenes

    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    
    boolean prime[] = new boolean[n+1];
    for(int i=0;i<n;i++)
    {
      prime[i] = true;
    }
    for(int i=2;i<Math.sqrt(n);i++)
    {
      if(prime[i] == true)
      {
        for(int j = (i * i);)
      }
    }


  }

}
