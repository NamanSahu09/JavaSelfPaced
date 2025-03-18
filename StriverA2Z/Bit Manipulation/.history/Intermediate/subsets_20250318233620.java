package Intermediate;
import java.util.*;
public class subsets 
{

  public List<List<Integer>> subsets(int[] nums) 
  {
    List<List<Integer>> ans = new ArrayList<>();
      int subsets = 1 << nums.length; 

      for (int i = 0; i < subsets; i++) 
      {  
          List<Integer> list = new ArrayList<>();

          for (int j = 0; j < nums.length; j++) {  
              if ((i & (1 << j)) != 0) 
              {  
                  list.add(nums[j]);
              }
          }
          ans.add(list);
      }
      return ans;
  
  }

  public static void main(String args[])
  {
    int nums[] = {1,2,3};
    subsets obj = new subsets();
    List<List<Integer>> list = new ArrayList<>();
    list = obj.subsets(nums);
    foreach()


  }

  
}
