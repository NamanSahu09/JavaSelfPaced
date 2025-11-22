import java.util.*;

public class subsequence {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n (size of array): ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // empty list to store current subsequence
        List<Integer> curr = new ArrayList<>();

        // start from index 0
        subseq(0, arr, curr);

        sc.close();
    }

    static void subseq(int idx, int[] arr, List<Integer> curr) {
        // base case: index goes out of array
        if (idx == arr.length) {
            // print current subsequence
            if (curr.isEmpty()) {
                System.out.println("{}"); // empty subsequence
            } else {
                for (int x : curr) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            return;
        }

        // TAKE the current element
        curr.add(arr[idx]);
        subseq(idx + 1, arr, curr);

        // NOT TAKE the current element
        curr.remove(curr.size() - 1);
        subseq(idx + 1, arr, curr);
    }
}
