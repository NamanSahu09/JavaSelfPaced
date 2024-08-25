public class SelectionSortRecursive {

  static void selection(int arr[], int i, int n) {
      // Base case: If the array is completely sorted
      if (i == n - 1)
          return;

      // Find the index of the minimum element in the unsorted portion
      int min = i;
      for (int j = i + 1; j < n; j++) {
          if (arr[j] < arr[min]) {
              min = j;
          }
      }

      // Swap the found minimum element with the first element of the unsorted portion
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;

      // Move to the next element and sort the remaining array
      selection(arr, i + 1, n);
  }

  public static void main(String args[]) {
      int arr[] = {22, 33, 11, 21, 5, 3, 55, 31};

      selection(arr, 0, arr.length); // Call the sort function

      // Print the sorted array
      for (int i : arr) {
          System.out.print(i + " ");
      }
  }
}
