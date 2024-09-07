package com.conditions_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // For loop
//        Syntax
//        for (initialization; conditions; increment/decrement){
//            //body
//        }

        // Q. Print Numbers from 1 top 5
//        for (int num =1; num <= 5 ; num+=1)
//            System.out.println(num);
//    }

//    Q. Print number from 1 to n
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hello World");
//        }

        // While Loop
//        Syntax
//        while (condition){
//            //body
//        }

//        int num = 1; // initialization
//        while(num <=5){ //condition
//            System.out.println(num);
//            num += 1; // increment-decrement
//        }

        // Do-while Loop -> Atleast once it will execute before the condition checking
//        Syntax
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while (n<=5);


    }
}

// Use while loop when you dont know how many times the loop will run
//Use for loop  when you know how many times the loop will run