package com.firstjava;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first no. : ");
        int num1 = input.nextInt();
        System.out.print("Please enter the second no. : ");
        int num2 = input.nextInt();
        int sum =  num1 + num2;

        System.out.println("Sum : "+ sum);
    }
}
