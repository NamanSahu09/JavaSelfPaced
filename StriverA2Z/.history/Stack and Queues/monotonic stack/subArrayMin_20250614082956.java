import java.util.*;
class subArrayMin 
{
    public int[] getNSL(int arr[])
    {
        int n = arr.length;
        int nsl[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++)
        {
            if(st.empty())
            {
                nsl[i] = -1;
            }
            else
            {
                while(!st.empty() && arr[st.peek()] >= arr[i])
                st.pop();

                nsl[i] = st.empty() ? -1 : st.peek();
            }
            st.push(i);
        }
        return nsl;
    }
      public int[] getNSR(int arr[])
    {
        int n = arr.length;
        int nsr[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1 ; i>=0; i--)
        {
            if(st.empty())
            {
                nsr[i] = n;
            }
            else
            {
                while(!st.empty() && arr[st.peek()] > arr[i])
                st.pop();

                nsr[i] = st.empty() ? n : st.peek();
            }
            st.push(i);
        }
        return nsr;
    }
   
   
   
   
    public int sumSubarrayMins(int[] arr) 
    {
        int nsl[] = getNSL(arr);
        int nsr[] = getNSR(arr);
        int M = (int) 1e9 + 7;
        int sum = 0;

        for(int i=0; i<arr.length; i++)
        {   
            long ls = i - nsl[i];
            long rs = nsr[i] - i;

            long totalWays = ls * rs;
            long totalSum = totalWays * arr[i];
            sum = (int) ((sum + totalSum) % M);
        }
        return sum;

    }
    public static void main(String args[])
    {
      
    }
}