package com.firstjava.assignment;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNum = input.nextInt();
        if (firstNum > secondNum){
            System.out.println(firstNum + " is larger");
        }else {
            System.out.println(secondNum+ " is larger");
        }

    }
}
