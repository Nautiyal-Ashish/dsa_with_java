package com.LectureCode.firstjava;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temp in Celcius : ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5)+32;
        System.out.println(tempF);

    }
}
