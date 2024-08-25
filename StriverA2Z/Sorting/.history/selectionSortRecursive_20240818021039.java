public class selectionSortRecursive {
  

  static int i=0;
  static void selection(int arr[], int n)
  {

    if( n == 1)
    return;

    int j =0;
    int min = i;
    for(j = i ; j<n-1;j++)
    {
      
      if(arr[j] < arr[min])
      {
        min = j;
      }
    }
    int temp = arr[min];
    arr[min] = arr[j];
    arr[j] = temp;
    


  }
  
  
  
  public static void main(String args[])
  {
    int arr[] = {22,33,11,21,5,3,55,31};
  
  
  
  }
  
}
