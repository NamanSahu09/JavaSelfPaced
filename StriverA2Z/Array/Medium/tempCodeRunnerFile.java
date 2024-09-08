  private static void reverseRow(int[] row, int m) {
    int left = 0;
    int right = m - 1;
    while (left < right) {
        int temp = row[left];
        row[left] = row[right];
        row[right] = temp;
        left++;
        right--;
    }
}