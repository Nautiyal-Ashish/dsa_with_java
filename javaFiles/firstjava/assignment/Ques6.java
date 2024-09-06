package com.firstjava.assignment;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter currency amount in rupees (₹) : ");
        double inr = input.nextInt();
        double convertInUsd = inr * 0.012;
        System.out.println(convertInUsd + " $");
    }
}
