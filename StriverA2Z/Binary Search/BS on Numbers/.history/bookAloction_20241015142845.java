public class bookAloction
{
  public static void main(String args[])
  {
    int[] stalls = {0, 3, 4, 7, 10, 9};
    int k = 4;
    int ans = aggressiveCows(stalls, k);
    System.out.println("The maximum possible minimum distance is: " + ans);
  }
  
}
