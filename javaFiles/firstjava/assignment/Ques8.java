package com.firstjava.assignment;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        // Convert the string to lowercase to make the check case-insensitive
        String normalizedString = originalString.toLowerCase();

        // Reverse the string
        String reversedString = "";
        for (int i = normalizedString.length() - 1; i >= 0; i--) {
            reversedString += normalizedString.charAt(i);
        }

        // Check if the original and reversed strings are equal
        if (normalizedString.equals(reversedString)) {
            System.out.println(originalString + " is a Palindrome.");
        } else {
            System.out.println(originalString + " is not a Palindrome.");
        }

        input.close();
    }
}
