import java.util.*;
class largestRect {
  public int largestRectangleArea(int[] arr) 
  {
      Deque<Integer> st = new ArrayDeque<>();
      int maxArea = Integer.MIN_VALUE;
      int element,nse,pse;
      int n = arr.length;
      for(int i=0;i<n;i++)
      {
          while(!st.isEmpty() && arr[st.peek()] > arr[i])
          {
              element = st.peek();
              st.pop();
              nse = i;
              pse = st.isEmpty() ? -1 : st.peek();
              maxArea = Math.max(maxArea, arr[element] * (nse - pse - 1));
          }
          st.push(i);
      }

      while(!st.isEmpty())
      {
          nse = n;
          element = st.peek();
          st.pop();
          pse = st.isEmpty() ? -1 : st.peek();
          maxArea = Math.max(maxArea, (nse - pse - 1) * arr[element]);
      }
      return maxArea;
  }
  public static void main(String args[])
  {
      largestRect obj = new largestRect();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements in the array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements of the array:");
      for(int i=0;i<n;i++)
      {
          arr[i] = sc.nextInt();
      }
      int result = obj.largestRectangleArea(arr);
      System.out.println("The largest rectangle area is: " + result);
      sc.close();
  }
}