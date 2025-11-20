
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
}