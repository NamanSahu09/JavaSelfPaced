import java.util.*;

class max1s
{





public static void main(String[] args) {
  ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
  matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
  matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
  matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

  int n = 3, m = 3;
  System.out.println("The row with the maximum number of 1's is: " +
                     rowWithMax1s(matrix, n, m));
}