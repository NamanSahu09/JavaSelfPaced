class squareroot
{
  public static void main(String a[])
  {
    long no = 28L;
    long low = 1;
    long high = no;
    while(low <= high)
    {
      long mid = low + (high - low) / 2;
      long val = mid * mid;
      if(val > no)
      {
        high = mid - 1;
      }
      else
      low = mid +1
    }
  }
}