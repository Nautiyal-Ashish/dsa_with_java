package com.firstjava.assignment;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input range from the user
        System.out.print("Enter the lower number: ");
        int lowerBound = input.nextInt();
        System.out.print("Enter the upper number: ");
        int upperBound = input.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");

        // Check each number in the range if it is an Armstrong number
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        input.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length(); // Find the number of digits

        while (num != 0) {
            int digit = num % 10;
            result += (int) Math.pow(digit, n);
            num /= 10;
        }

        return result == originalNum;
    }
}