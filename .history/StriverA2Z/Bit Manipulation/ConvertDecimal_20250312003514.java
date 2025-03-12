import java.util.*;
public class ConvertDecimal
{
  public static void main(String args[])
  {
    String s = "1101";
    int res = 0;
    for(int i=s.length()-1;i>=0;i--)
    {
      if(s.charAt(i)=='1')
      {
        res+=Math.pow(2,s.length()-1-i);
      }
    }
  }
}