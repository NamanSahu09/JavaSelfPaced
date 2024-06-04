public class eleven
{
    public static void main(String args[])
    {
        int k=1,c=1;
        for(int i=1;i<=5;i++)
        {
            if(c%2==0)
            {
                k=0;
                for(int j =1;j<=i;j++)
                {
                    if(k==0)
                    {
                        System.out.print(k);
                        k=1;
                    }
                    else
                    {
                        System.out.print(k);
                        k=0;
                    }
                    
                }
            } // even rows
            else
            {
                k=1;
                for(int j=1;j<=i;j++)
                {
                    if(k==1){
                        System.out.print(k);
                        k=0;
                    }
                    else
                    {
                        System.out.print(k);
                        k=1;
                    }
                }
            }
            System.out.println();
            c++;
        }
    }
}