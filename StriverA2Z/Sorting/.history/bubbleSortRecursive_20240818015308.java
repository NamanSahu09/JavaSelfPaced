import java.util.*;

public class BubbleSortRecursive {

    static void bubbleSortRecursive(int arr[], int no) {
        if (no == 1) {
            return;
        }

        boolean swapped = false;
        for (int j = 0; j < no - 1; j++)
         {

            if (arr[j] > arr[j + 1])
             {  
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        
        if (!swapped) {
            return;
        }

        bubbleSortRecursive(arr, no - 1);
    }

    static void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array Inserted:");
        printArray(arr);
        
        bubbleSortRecursive(arr, arr.length);
        
        System.out.println("Sorted Array:");
        printArray(arr);
        
        sc.close();
    }
}
