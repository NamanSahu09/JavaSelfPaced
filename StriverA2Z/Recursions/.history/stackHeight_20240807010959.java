public class stackHeight {
  static int calcFun(int x, int n)
  {
    if(n == 0)
    return 1;
    if(x == 0)
    return 0;
    int store = calcFun(x, n-1);
    return x * store;
  }
  
  public static void main(String[] args) {
    int x = 2, n = 5;
    System.out.println("Height of stack after " + n + " push operations: " + calcFun(x, n));
  }
  
}
