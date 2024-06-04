public class twenty
{
    public static void main(String args[])
    {
        int s = 8;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k =1; k<=s;k++)
            {
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
            s-=2; 
        }
        s=2; int n =4;
        for(int i=1;i<=4;i++)
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
            n--;
            s+=2;
        }
    }
}