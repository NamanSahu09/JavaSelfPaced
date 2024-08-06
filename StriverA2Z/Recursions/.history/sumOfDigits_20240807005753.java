public class sumOfDigits {
  static int digitSum(int n)
  {
    if(n == 0)
    return 0;
    int dSum = digitSum(n/10);
    return dSum + n%10;
  }
  
}
