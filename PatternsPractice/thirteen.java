public class thirteen
{
    public static void main(String args[])
    {
        // 65-90
        int k=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)k);
                k++;
                if(k>90)
            {
                k=65;
            }
            }
            System.out.println();
            
            k=65;
            
        }
    }
}