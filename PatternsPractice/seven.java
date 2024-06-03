public class seven
{
    public static void main(String args[])
    {
        int n=5;
        int s=1;
        
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=n-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=s;j++)
            {
                System.out.print("*");
            }
            s+=2;
            System.out.println();
            n--;
        }
    }
}