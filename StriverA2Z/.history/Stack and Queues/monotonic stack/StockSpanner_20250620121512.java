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
        StockSpanner obj = new StockSpanner();
        System.out.println(obj.next(100)); // Output: 1
        System.out.println(obj.next(80));  // Output: 1
        System.out.println(obj.next(60));  // Output: 1
        System.out.println(obj.next(70));  // Output: 2
        System.out.println(obj.next(60));  // Output: 1
        System.out.println(obj.next(75));  // Output: 4
        System.out.println(obj.next(85));  // Output: 6
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
