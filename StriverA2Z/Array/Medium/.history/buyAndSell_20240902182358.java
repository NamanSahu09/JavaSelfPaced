public class buyAndSell 
{
  static int maxProfit(int[] prices) 
  {
      int maxProfit =0;
      int min=prices[0];
      int currProfit=0;
      for(int i=1;i<prices.length;i++)
      {
          currProfit = prices[i] - min;
          maxProfit = Math.max(maxProfit,currProfit);
          min = Math.min(min,prices[i]);
      }
      System.out.println(maxProfit+" "+);
      return currProfit;
      
  }
  public static void main(String args[])
  {
    int arr[] = {7,1,5,3,6,4};
    System.out.println("Maximum Profit: "+maxProfit(arr));
    
  }
  
}
