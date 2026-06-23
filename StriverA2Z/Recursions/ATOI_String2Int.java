import java.util.*;
public class ATOI_String2Int
{

    static final int MIN_VAL = Integer.MIN_VALUE/10;
   static final int MAX_VAL = Integer.MAX_VALUE/10;
  public static int atoi(String s)
  {
    int i =0;
    int sign = 1;
    //increase i till the end of space
    while(i<s.length() && s.charAt(i) == ' ') i++;

    //check for sign
    while(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
    {
      sign = s.charAt(i) == '-' ? -1 : 1;
      i++;
    }

    return helper(s,i,0,sign);
    
  }

  private static int helper(String s, int i, long num, int sign) 
  {
   if(i >= s.length() || !Character.isDigit(s.charAt(i)))
   {
    return (int) num * sign;
   }


   num = num*10 + (s.charAt(i) - '0');
   
   if(sign*num >= MAX_VAL) return MAX_VAL;
   if(sign*num <= MIN_VAL) return MIN_VAL;
   

   return helper(s,i+1,num,sign);



  }



  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String st  = "";
    System.out.println("Enter a String: ");
    st = sc.next();
    System.out.println(atoi(st));
  }

  





}