import java.util.*;

public class QuickSort {

    static int sortt(int arr[], int low, int high) {
        int pivot = arr[low];  // pivot is the first element
        int i = low + 1;  // start i from the element next to the pivot
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element with arr[j]
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

    static void quickSortt(int arr[], int low, int high) {
        if (low < high) {
            int partition = sortt(arr, low, high);
            quickSortt(arr, low, partition - 1);
            quickSortt(arr, partition + 1, high);
        }
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {5, 4, 3, 1, 6, 7, 8, 2};
        int n = arr.length;

        quickSortt(arr, 0, n - 1);
        display(arr);

        sc.close();
    }
}
