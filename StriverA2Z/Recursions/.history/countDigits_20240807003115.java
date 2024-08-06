public class countDigits {
   int cnt = 0;
  static void count(int no)
  {
    
    if(no == 0)
    {
      System.out.println("Count is "+ cnt);
    }
    cnt++;
    count(no/10); 
  }
  public static void main(String args[])
  {
    int no = 12345;
    count(no);
  }


}
