import java.util.*;
class Solution {
  public int totalFruit(int[] fruits) 
  {
       HashMap<Integer, Integer> mp = new HashMap<>();
       int k = 2;
      int maxLen = 0;
      int right =0,left =0;
      while(right < fruits.length)
      {
          mp.put(fruits[right],mp.getOrDefault(fruits[right],0) + 1);
          if(mp.size() > k)
          {
              mp.put(fruits[left],mp.get(fruits[left]) - 1);
              if(mp.get(fruits[left]) == 0)
              mp.remove(fruits[left]);
              left++;
          }
          if(mp.size() <= k)
          {
              maxLen = Math.max(maxLen, right - left + 1);
          }
          right++;
      }
  return maxLen;
  }
  public static void main(String args[])
  {
      Solution obj = new Solution();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of fruits:");
      int n = sc.nextInt();
      int[] fruits = new int[n];
      System.out.println("Enter the types of fruits:");
      for(int i=0; i<n; i++)
      {
          fruits[i] = sc.nextInt();
      }
      int result = obj.totalFruit(fruits);
      System.out.println("The maximum number of fruits that can be collected is: " + result);
      sc.close();
  }
}