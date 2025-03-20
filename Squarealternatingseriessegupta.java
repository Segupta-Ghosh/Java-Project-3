package com.mycompany.squarealternatingseriessegupta;

import java.util.Scanner;

public class Squarealternatingseriessegupta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            sum += oddNumber * oddNumber; // Adding square of the odd number
        }

        System.out.println("Sum of the series up to " + n + " terms: " + sum);
    }
}