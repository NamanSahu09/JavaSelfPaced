public class bitCheckClearChange {
 

      // Function to check if Kth bit is set or not.
      static boolean checkKthBit(int n, int k) 
      {
          // Your code here
          // It can be a one liner logic!! Think of it!!
          
           return (((n>>k) & 1) ==0) ? false : true;
      }
 

    static String setIBit(int N, int i)
    {
      
    }


      public static void main(String args[])
      {
        System.out.println(checkKthBit(13, 2));
      }
      
}
