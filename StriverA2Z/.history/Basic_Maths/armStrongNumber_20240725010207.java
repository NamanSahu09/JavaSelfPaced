package Basic_Maths;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int rem = 0;
        int sum = 0; // Changed to int

        while (num != 0) {
            rem = num % 10;
            sum = sum + (int) Math.pow(rem, 3); // Cast result to int
            num = num / 10;
        }

        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
