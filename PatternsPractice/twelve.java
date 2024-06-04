public class twelve
{
    public static void main(String args[])
    {
        int n =6;
        for(int i=1;i<=4;i++)
        {
            int j;
            for( j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<=n;k++)
            {
                System.out.print(" ");
            }
            for(int l = j-1;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
            n-=2;
        }
    }
}