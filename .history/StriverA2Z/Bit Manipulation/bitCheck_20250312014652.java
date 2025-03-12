public class bitCheck {
 

      // Function to check if Kth bit is set or not.
      bool checkKthBit(int n, int k) 
      {
          // Your code here
          // It can be a one liner logic!! Think of it!!
          
           return (((n>>k) & 1) ==0) ? false : true;
      }
 
      public static void main(String args[])
      {
        
      }
      
}
