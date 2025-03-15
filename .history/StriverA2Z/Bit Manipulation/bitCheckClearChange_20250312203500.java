public class bitCheckClearChange {
 

      // Function to check if Kth bit is set or not.
      static boolean checkKthBit(int n, int k) 
      {
          // Your code here
          // It can be a one liner logic!! Think of it!!
          
           return (((n>>k) & 1) ==0) ? false : true;
      }
 

    static int setIBit(int N, int i)
    {
       return  N |(1<<i);

    }


      public static void main(String args[])
      {
        System.out.println();
        System.out.println("After setting 2nd bit: " + setIBit(13, 2));
      }
      
}
