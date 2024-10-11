class reverseWords
{
  public static void main(String ar)



String st1="",st2="";
Stack<String>stk = new Stack();
int l = str.length();
for(int i=0; i<l;i++)
{
   char c = str.charAt(i);
   if(c != '.')
   {
       st1 = st1+c;
   }
   else if(c == '.')
   {
      
       stk.push(st1);
       stk.push(".");
       st1 = "";
   }
}
if (!st1.isEmpty()) 
{
     stk.push(st1);
 }
while(!stk.empty())
{
    st2 = st2  + stk.pop();
}
System.out.println(st2);
}
}