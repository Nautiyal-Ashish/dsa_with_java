package com.conditions_loops;

public class CountOccurence {
    public static void main(String[] args) {
        int n = 4535535;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == 3){
                count++;
            }
            n = n/10;
        }

        System.out.println(count);
    }
}
