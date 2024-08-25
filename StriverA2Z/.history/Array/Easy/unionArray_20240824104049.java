package Array.Easy;
import java.util.*;
public class unionArray {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    // HashSet <Integer> set = new HashSet<>();
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int arr1[] = {2,4,5,67,88,99};
    // for(int i=0;i<arr.length;i++)
    // {
    //   set.add(arr[i]);
    // }
    // for(int i=0;i<arr1.length;i++)
    // {
    //   set.add(arr1[i]);
    // }
    // for(int i:set)
    // {
    //   System.out.print(i+" ");
    // }



    //OPTIMAL APPROACH

    ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr.length;
        int m = arr1.length;

        while (i < n && j < m) {
            if (arr[i] <= arr1[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != arr[i]) {
                    list.add(arr[i]);
                }
                i++;
            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[j]) {
                    list.add(arr1[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
            i++;
        }

        while (j < m) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr1[j]) {
                list.add(arr1[j]);
            }
            j++;
        }

        for (int k : list) {
            System.out.print(k + " ");
        }
    }

    sc.close();
  }
  
}
