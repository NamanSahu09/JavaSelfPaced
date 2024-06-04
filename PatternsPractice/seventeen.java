public class seventeen
{
    public static void main(String args[])
    {
        int n=4,c=64,n1=1,count=1;
        for(int i=1;i<=5;i++)
        {
          for(int k=1;k<=n;k++)
          {
              System.out.print(" ");
              
          }
          for(int j=1;j<=n1;j++)
          {
              if(count <=i)
              {
                  c++;
                  System.out.print((char)c);
                  
              }
              else
              {   
                  --c;
                  System.out.print((char)c);
                  
                 
              }
              ++count;
            }
            c=64;
            n--;
            n1+=2;
            System.out.println();
            count=1;
        }
    }
}