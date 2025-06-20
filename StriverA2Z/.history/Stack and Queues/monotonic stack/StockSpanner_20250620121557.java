import java.util.*;
class StockSpanner 
{
    static class Pair 
    {
        int val;
        int idx;

        Pair(int val, int idx) 
        {
            this.val = val;
            this.idx = idx;
        }
    }
    Stack<Pair> st;
    int idx;

    public StockSpanner() 
    {
        st = new Stack<>();
        idx = -1;
    }
    
    public int next(int price) 
    {
        idx++;
         while (!st.isEmpty() && st.peek().val <= price) 
         {
            st.pop();
         }
         int ans;
        if (st.isEmpty()) 
        {
            ans = idx + 1;
        } 
        else 
        {
            ans = idx - st.peek().idx;
        }

        st.push(new Pair(price, idx));
        return ans;
    }

    public static void main(String args[])
    {
        StockSpanner ss = new StockSpanner();
int[] prices = {100, 80, 60, 70, 60, 75, 85};
for (int price : prices) {
    System.out.print(ss.next(price) + " ");
}   
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
