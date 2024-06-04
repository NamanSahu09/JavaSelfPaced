public class fifteen
{
    public static void main(String args[])
    {
        //a
        //bb
        //ccc
        //dddd
        int k=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)k);
            }
            k++;
            System.out.println();
        }
    }
}