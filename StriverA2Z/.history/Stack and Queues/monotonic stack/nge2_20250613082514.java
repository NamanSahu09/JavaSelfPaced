import java.util.
class nge2 {
  public int[] nextGreaterElements(int[] nums) 
  {
      int n = nums.length;
      Stack<Integer> st = new Stack<>();
      int arr[] = new int[n];
      
      for(int i=2*n -1; i>=0 ; i--)
      {
          //monotonic nature stack
          while(!st.empty() && nums[st.peek()] <= nums[i%n])
          {
              st.pop();
          }
          
            arr[i % n] = st.empty() ? -1 : nums[st.peek()];
          
           st.push(i % n);
      }
      return arr;
  }
}