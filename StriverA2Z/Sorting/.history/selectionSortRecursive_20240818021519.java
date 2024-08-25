public class selectionSortRecursive {

  static void selection(int arr[], int i, int n) {
   
      if (i == n)
          return;

   
      int min = i;
      for (int j = i + 1; j < n; j++) {
          if (arr[j] < arr[min]) {
              min = j;
          }
      }

      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;


      selection(arr, i + 1, n);
  }

  public static void main(String args[]) {
      int arr[] = {22, 33, 11, 21, 5, 3, 55, 31};

      selection(arr, 0, arr.length); 

      // Print the sorted array
      for (int i : arr) {
          System.out.print(i + " ");
      }
  }
}
