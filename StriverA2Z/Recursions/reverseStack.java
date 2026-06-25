import java.util.*;
public class reverseStack 
{

    public void insertAtBottom(Stack<Integer> st, int element)
  {
    if(st.empty()) 
    {
      st.push(element);
      return;
    }
    int temp = st.pop();
    insertAtBottom(st,element);
    st.push(temp);
  }

  public void stackReverse(Stack<Integer> st)
  {
    //using recusion 
    if(st.empty())
    {
      return;
    }
    int temp = st.pop();
    stackReverse(st);
    insertAtBottom(st,temp);
    

  }




  public static void main(String args[])
  {
    Stack<Integer> st = new Stack<>();
    reverseStack obj = new reverseStack();
    st.add(1);
    st.add(2);
    st.add(3);
    st.add(4);
    obj.stackReverse(st);
    while(!st.empty()) 
      {
        System.out.println(st.peek());
        st.pop();
      }
  }
  
}
