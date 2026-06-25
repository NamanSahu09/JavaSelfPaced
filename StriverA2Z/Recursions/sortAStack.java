import java.util.*;
public class sortAStack 
{
  
  public void sortStack(Stack<Integer> st)
  {
      if(st.size() == 1)
      {
        return;
      }
      int temp = st.pop();
      
      sortStack(st);
      insert(st,temp);

  }
  
  public void insert(Stack<Integer> st, int element)
  {
    if(st.empty() || st.peek() < element)
    {
      st.push(element);
      return;
    }
    int temp = st.pop();
    insert(st,element);
    st.push(temp);
  }


  public static void main(String args[])
  {
    sortAStack obj = new sortAStack();
    Stack<Integer> st = new Stack<>();
    st.add(2);
    st.add(3);
    st.add(1);
    st.add(4);
    obj.sortStack(st);

    //print stack
    while(!st.empty())
    {
      System.out.println(st.peek());
      st.pop();
    }
  }
  
}
