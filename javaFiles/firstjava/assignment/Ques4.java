package com.firstjava.assignment;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double firstNum = input.nextInt();
        System.out.print("Enter the second number : ");
        double secondNum = input.nextInt();
        System.out.print("Enter the operator : ");
        String operator = input.next();

        if (operator.equals("+")){
            System.out.println("Your total is : "+ (firstNum+secondNum));
        } else if (operator.equals("-")) {
            System.out.println("Your total is : "+ (firstNum-secondNum));
        } else if (operator.equals("*")) {
            System.out.println("Your total is : "+ (firstNum*secondNum));
        }else if (operator.equals("/")) {
            System.out.println("Your total is : "+ (firstNum/secondNum));
        }else{
            System.out.println("Invalid operator");
        }
    }
}
