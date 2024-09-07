package com.conditions_loops;

public class Reverse {
    public static void main(String[] args) {
        int num = 263292;

        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
