public class nine
{
    public static void main(String args[])
    {
        
        int n = 5; int s =1;
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<n;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=s;j++)
            {
                System.out.print("*");
            }
            n--;
            s+=2;
            System.out.println();
        }
        n=10;
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            n-=2;
        }
        
        
        
        
    }
}