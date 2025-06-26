import java.util.*;
class longestSubstring {
  public int lengthOfLongestSubstring(String s) 
  {
      HashMap<Character,Integer> mp = new HashMap<>();
      int maxLength = 0;
      int left = 0,right=0;
      int n = s.length();
      while(right < n)
      {
          if(mp.containsKey(s.charAt(right)))
          {
              left = Math.max(mp.get(s.charAt(right)) + 1, left);
          }
          mp.put(s.charAt(right), right);
          maxLength = Math.max(maxLength, right - left + 1);
          right++;
      }
      return maxLength;
      
  }
  public static void main(String[] args) 
  {
      longestSubstring obj = new longestSubstring();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string:");
      String s = sc.nextLine();
      int result = obj.lengthOfLongestSubstring(s);
      System.out.println("The length of the longest substring without repeating characters is: " + result);
      sc.close();
  }
}