public class eighteen
{
    public static void main(String args[])
    {
        //E
        //DE
        //CDE
        //BCDE
        //ABCDE
        
        int c=69;
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)c);
                c++;
            }
            c=69;
            c = c-i;
            System.out.println();
        }
        
        
    }
}