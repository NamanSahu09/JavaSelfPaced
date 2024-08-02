import java.util.*;

public class swapRecursion {

  void swap(ArrayList<Integer> arr, int i, int j) {
    int temp = arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, temp);
  }

  void reverseArray(int i, ArrayList<Integer> arr, int no) {
    if (i >= no / 2)
      return;
    else {
      swap(arr, i, no - i - 1);
      reverseArray(i + 1, arr, no);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> arr = new ArrayList<>();

    while (true) {
      System.out.println("Enter element");
      int num = sc.nextInt();
      arr.add(num);
      System.out.println("Do you want to add more elements? (yes/no)");
      String choice = sc.next();
      if (choice.equalsIgnoreCase("no")) {
        break;
      }
    }
    
    System.out.println("Array before reversing: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    int no = arr.size();
    swapRecursion sr = new swapRecursion();
    sr.reverseArray(0, arr, no);

    System.out.println("Array after reversing: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    sc.close();
  }
}
