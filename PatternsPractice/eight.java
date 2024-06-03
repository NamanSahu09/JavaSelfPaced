
public class eight
{
   public static void main(String args[])
   {
       int n=10;
       for(int i=1;i<=5;i++)
       {
           for(int k = 1; k<i;k++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<n;j++)
           {
               System.out.print("*");
           }
         
           System.out.println();
           n = n-2;
       }
   }
}
