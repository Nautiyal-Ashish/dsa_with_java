package com.conditions_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while(true){
            // take operator as input
            System.out.print("Enter the operator (To exit press 'x'): ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                System.out.print("Enter first number : ");
                int num1 = in.nextInt();
                System.out.print("Enter second number : ");
                int num2 = in.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            }else {
                System.out.println("invalid operation");
            }

            System.out.println(ans);
        }
    }
}
