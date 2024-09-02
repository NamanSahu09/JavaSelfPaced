public class buyAndSell 
{
  public int maxProfit(int[] prices) 
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
      return currProfit;
      
  }
  public static void main(String args[])
  {
    
  }
  
}
