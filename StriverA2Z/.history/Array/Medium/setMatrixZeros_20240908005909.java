import java.util.*;
class setMatrixZeros
{
  public void setZeroes(int[][] matrix) 
{
    int col0 = 1;
    int n = matrix.length;  
    int m = matrix[0].length;

    // Step 1: Mark rows and columns that need to be zeroed
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] == 0) {
                // Mark the row
                matrix[i][0] = 0;

                // Mark the column
                if (j != 0) { // For columns other than the first one
                    matrix[0][j] = 0;
                } else {
                    col0 = 0; // First column needs to be zeroed
                }
            }
        }
    }

    // Step 2: Set the matrix elements to zero based on marked rows and columns
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    // Step 3: Set the first row to zero if necessary
    if (matrix[0][0] == 0) {
        for (int j = 0; j < m; j++) {
            matrix[0][j] = 0;
        }
    }

    // Step 4: Set the first column to zero if necessary
    if (col0 == 0) {
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 0;
        }
    }
}

  public static void main(String args[])
  {






    




  }
}