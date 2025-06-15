import java.util.Scanner;
class removeKDigits {

  public String removeKdigits(String num, int k) 
  {
      Stack<Character>st = new Stack<>();
      
      for(char digit : num.toCharArray())
      {
          while(!st.isEmpty() && k > 0 && st.peek() - '0' > digit - '0')
          {
              st.pop();
              k--;
          }
          st.push(digit);
      }

      //Edge Cases

      //remove extra digits 1,2,3,4,5 in stack k =3
      while(!st.isEmpty() && k>0)
      {
          st.pop();
          k--;
      }

      //reverse the string
      StringBuilder sb = new StringBuilder();
      while(!st.isEmpty())
      {
        sb.append(st.pop());
      }
      sb.reverse();

      //remove leading zeros
      
      for(int i=0;i<sb.length();)
      {
          char c = sb.charAt(i);

          if(c == '0')
          {
              sb.deleteCharAt(i);
          }
          else 
          {
              break;
          }
         
      }

      return sb.length() > 0 ? sb.toString() : "0";



  }
  public static void main(String[] args) 
  {
      Solution solution = new Solution();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      String num = sc.nextLine();
      System.out.println("Enter the number of digits to remove:");
      int k = sc.nextInt();
      
      String result = solution.removeKdigits(num, k);
      System.out.println("Resulting number after removing " + k + " digits: " + result);
  }
}
