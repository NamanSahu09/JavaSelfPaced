import java.util.*;
public class largestSubarrayWithSum0 
{

static int maxLen(int A[], int n)
{
    // Your code here
    HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

    int maxi = 0;
    int sum = 0; 

    for(int i = 0;i<n;i++) {

        sum += A[i]; 

        if(sum == 0) {
            maxi = i + 1; 
        }
        else {
            if(mpp.get(sum) != null) {

                maxi = Math.max(maxi, i - mpp.get(sum)); 
            }
            else {

                mpp.put(sum, i); 
            }
        }
    }
    return maxi; 
}

public static void main(String args[]) 
{ 
    int a[] = {9, -3, 3, -1, 6, -5};
    System.out.println(maxLen(a,a.length));
} 
  
}
