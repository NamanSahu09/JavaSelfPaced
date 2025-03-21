import java.util.*;
public class primeFactors {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
      {
        list.add(i);
        while(n%i==0)
        {
          n = n/i;
        }
      }
    }
    if(n!=1)
    {
      list.add(n);
    }
    System.out.println(list);



  }
}
