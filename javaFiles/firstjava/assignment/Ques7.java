package com.firstjava.assignment;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int firstNum = 0, secondNum = 1;

        System.out.print("Fibonacci Series up to " + n + " numbers: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNum + " ");

            // Calculate the next number in the series
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
