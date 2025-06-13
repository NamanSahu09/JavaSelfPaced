import java.util.*;
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
  public static void main(String args[])
  {
      nge2 obj = new nge2();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements in the array:");
      int n = sc.nextInt();
      int[] nums = new int[n];
      System.out.println("Enter the elements of the array:");
      for(int i = 0; i < n; i++) {
          nums[i] = sc.nextInt();
      }
      int[] result = obj.nextGreaterElements(nums);
      System.out.println("Next Greater Elements: " + Arrays.toString(result));
  }
}