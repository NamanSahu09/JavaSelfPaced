public class nineteen
{
    public static void main(String args[])
    {
        int n=5;
        int s=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=s;k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=n;l++)
            {
                System.out.print("*");
            }
            System.out.println();
            s+=2;
            n--;
            
        }
        s=8;
        for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
          {
              System.out.print("*");
          }
          for(int k=1;k<=s;k++)
          {
              System.out.print(" ");
          }
          for(int l=1;l<=i;l++)
          {
              System.out.print("*");
          }
          System.out.println();
          s-=2;
        }
        
        
        
        
        
    }
}