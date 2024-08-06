public class sumOfDigits {
  static int digitSum(int n)
  {
    if(n == 0)
    return 0;
    int dSum = digitSum(n/10);
    return dSum + n%10;
  }
  
  public static void main(String[] args) {
    int num = 252;
    System.out.println("Sum of digits of " + num + " is " + digitSum(num));
  }
  
}
