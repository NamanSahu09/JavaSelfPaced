public class fourteen
{
    public static void main(String args[])
    {
        //ABCDE
        //ABCD
        //ABC
        int k=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print((char)k);
                k++;
            }
            k=65;
            System.out.println();
        }
    }
}