public class bitCheckClearChange {
 

      // Function to check if Kth bit is set or not.
      static boolean checkKthBit(int n, int k) 
      {
        //f
           return (((n>>k) & 1) ==0) ? false : true;
      }
 

    static int setIBit(int N, int i)
    {
       return  N |(1<<i);

    }
    static int clearIBit(int N, int i)
    {
        return  N & (~(1<<i));
    }

      public static void main(String args[])
      {
        System.out.println("Checking 2nd bit: " + checkKthBit(4,2));
        System.out.println("After setting 2nd bit: " + setIBit(9, 2));
      }
      
}
