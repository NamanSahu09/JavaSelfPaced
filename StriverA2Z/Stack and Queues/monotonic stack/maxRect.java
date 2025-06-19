import java.util.Stack;
import java.util.*;
public class maxRect {

    public int lHist(int arr[])
    {
        Stack<Integer>st = new Stack<>();
        int nse,pse;
        int maxArea = 0;
        int n = arr.length;
        int element = 0;
        for(int i=0; i<n; i++)
        {
            while(!st.isEmpty() && arr[st.peek()] > arr[i])
            {
                element = arr[st.peek()];
                st.pop();
                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, element * (nse - pse - 1));
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            element = st.peek();
            st.pop();
            nse = n;
            pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, arr[element] * (nse - pse - 1));
        }
        return maxArea;
    }


    public int maximalRectangle(char[][] arr) 
    {
        int m = arr.length;
        int n = arr[0].length;
        int pSum[][] = new int[m][n];
        int sum=0;

        for(int j=0;j<n;j++)
        {
            sum = 0;
            
            for(int i=0;i<m;i++)
            {
                //sum+= arr[i][j];
                if (arr[i][j] == '1') 
                {
                    sum = (i == 0) ? 1 : pSum[i - 1][j] + 1;
                } 
                else 
                {
                    sum = 0;
                }
                pSum[i][j] = sum;
            }
        }

        int maxArea = 0;
        for(int i=0;i<m;i++)
        {
            maxArea = Math.max(maxArea, lHist(pSum[i]));
        }

        return maxArea;  
    }
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();
        char[][] arr = new char[m][n];
        System.out.println("Enter the elements of the matrix (0 or 1):");
        for(int i=0;i<m;i++)
        {
            String row = sc.next();
            for(int j=0;j<n;j++)
            {
                arr[i][j] = row.charAt(j);
            }
        }
        int result = obj.maximalRectangle(arr);
        System.out.println("The maximal rectangle area is: " + result);
        sc.close(); 
    }
} 
  

