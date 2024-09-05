package com.firstjava;

import java.util.Scanner;

public class TypeCasting_Conversion {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        // Type Conversion
//        float num = input.nextFloat();
//        System.out.println(num);

        // Type Casting
//        int num = (int)(67.27f); //type casting syntax
//        System.out.println(num);

        // Automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); //byte is only 256 value
        // So in this it can not handle bigger number so,
        // it will do 257 % 256 = 1 (Remainder) and print the remainder
        System.out.println(b);

    }
}

//type conversion only work as :
//1. The type conversion should be between compatible types
//2. left side should be greater than right side

// Type Casting
//Explicitly converting the type
//Narrowing Conversion

// Type Promotion Rules
//1. Byte, short, or char operands are promoted to int when evaluating an expression.
//2. If any operand is long, float, or double, the entire expression is promoted to long, float, or double, respectively.
//3. Widening conversions (e.g., byte to int) do not lose information about the magnitude of a value.