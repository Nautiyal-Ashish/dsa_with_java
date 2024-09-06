package com.firstjava.assignment;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter principal : ");
        int P = input.nextInt();
        System.out.print("Please enter time : ");
        int T = input.nextInt();
        System.out.print("Please enter rate : ");
        int R = input.nextInt();

        int SI = (P * R * T) / 100;
        System.out.println("Simple Interest is : " + SI);
    }
}
